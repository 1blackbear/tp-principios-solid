package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import business.IProduto;
import business.Pedido;
import business.bebidas.Refrigerante;
import business.carnes.CarnePorco;
import business.exception.PedidoException;
import business.extras.Chili;
import business.pratos.Prato;
import business.pratos.PratoMedio;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/*
 * Testes a serem realizados:
 * Adicionar produto ao combo
 * Remover produto do combo
 * Calcular total do pedido
 * Alterar status do pedido
 * Gerar extrato do pedido 
 */

class PedidoTest {
	Prato produto;
	Pedido p;
	IProduto nulo = null;
	
	@BeforeEach
	void setUp() throws Exception {
		p =  new Pedido();
		produto = new PratoMedio();
		p.addProduto(produto);
	}
	
	@Test
	@DisplayName("Testando se o produto est� sendo adicionado ao combo do Pedido (IProduto nulo)")
	void testAddProdutoNulo() throws PedidoException {
				
		PedidoException thrown = Assertions.assertThrows(PedidoException.class, () -> {
			p.addProduto(nulo);
		}, "PedidoException was expected");
		
		Assertions.assertEquals("N�o foi poss�vel adicionar ao combo. (Produto Nulo)", thrown.getMessage());
	}
	
	@Test
	@DisplayName("Testando se o produto est� sendo adicionado ao combo do Pedido")
	void testAddProduto() throws PedidoException {
		assertThat(p.getCombo(), hasItems(produto));
	}
	
	@Test
	@DisplayName("Testando se o produto est� sendo removido do combo do Pedido (IProduto nulo ou n�o existente)")
	void testRemoveProdutoNulo() throws PedidoException {
		assertNull(p.removeProduto(nulo));
	}
	
	@Test
	@DisplayName("Testando se o produto est� sendo removido do combo do Pedido")
	void testRemoveProduto() throws PedidoException {
		assertEquals(p.removeProduto(produto), produto);
	}
	
	@Test
	@DisplayName("Testando se o calculo do total do Pedido est� em funcionameto")
	void testCalcularTotal() throws PedidoException {
		Prato prato;
		prato = new PratoMedio();
		prato = new CarnePorco(prato);
		prato = new Chili(prato);
		p.addProduto(prato);
		p.addProduto(new Refrigerante());
		
		assertEquals(p.calcularTotal(), 40.1d);
	}
	
	/*@Test
	@DisplayName("Testando se extrato do Pedido est� em funcionameto")
	void testExtrato() throws PedidoException {
		Prato prato;
		prato = new PratoMedio();
		prato = new Chili(prato);
		p.addProduto(prato);
		
		assertTrue(p.exibirExtrato() != " ");
	}*/
	
	@Test
	@DisplayName("Testando se o status do Pedido est� em 'Pedido Realizado'")
	void testStatusPR() throws PedidoException {
		assertEquals(p.getStatus(), "Pedido Realizado");
	}
	
	@Test
	@DisplayName("Testando se o status do Pedido est� em 'Pedido Retirado'")
	void testStatusPRet() throws PedidoException {
		p.setStatus("Pedido Retirado");
		assertEquals(p.getStatus(), "Pedido Retirado");
	}


}
