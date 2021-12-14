package test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import business.LEsperaSingleton;
import business.Pedido;
import business.exception.PedidoException;

/*
 * Testes a serem realizados:
 * Adicionar pedido à lista de espera com observer
 * Lista de espera Singleton
 * Remover item com obsever
 *
 */
class LEesperaSingletonTest {
	Pedido p;
	LEsperaSingleton lista_de_espera;
	
	@BeforeEach
	void setUp() throws Exception {
		p = new Pedido();
		lista_de_espera = LEsperaSingleton.getInstancia();
	}
	@Test
	@DisplayName("Testando se a lista de espera é única (Singleton)")
	void testListaSingleton() throws PedidoException {	
		LEsperaSingleton lista = LEsperaSingleton.getInstancia();
		assertEquals(lista_de_espera, lista);
	}
	
	
	@Test
	@DisplayName("Testando se o pedido foi adicionado à lista de espera")
	void testAddLista() throws PedidoException {
		lista_de_espera.addPedido(p);
		assertThat(lista_de_espera.getPedidos(), hasItems(p));
	}
	
	@Test
	@DisplayName("Testando se o pedido foi adicionado à lista de espera pelo observer")
	void testAddListaObserver() {
		assertThat(lista_de_espera.getPedidos(), hasItems(p));
	}
	
	@Test
	@DisplayName("Testando se o pedido foi removido da lista de espera")
	void testRemoveLista() throws PedidoException {
		assertEquals(lista_de_espera.removePedido(p), p);
	}
	

	@Test
	@DisplayName("Testando se o pedido foi removido da lista de espera pelo observer")
	void testRemoveListaObserver() throws PedidoException {
		p.setStatus("Pedido Retirado");
		assertThat(lista_de_espera.getPedidos(), not(p));
	}

}
