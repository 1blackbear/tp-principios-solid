package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import business.pratos.Prato;
import business.pratos.PratoGrande;
import business.pratos.PratoMedio;
import business.pratos.PratoPequeno;

class PratoTest {

	@Test
	@DisplayName("Teste tamanho grande")
	void testGrande() {
		Prato p = new PratoGrande();
		assertEquals("Tamanho grande", p.getDescricao());
		assertEquals(15.9d, p.getPreco());
	}
	
	@Test
	@DisplayName("Teste tamanho pequeno")
	void testPequeno() {
		Prato p = new PratoPequeno();
		assertEquals("Tamanho pequeno", p.getDescricao());
		assertEquals(9.9d, p.getPreco());
	}
	
	@Test
	@DisplayName("Teste tamanho medio")
	void testMedio() {
		Prato p = new PratoMedio();
		assertEquals("Tamanho médio", p.getDescricao());
		assertEquals(12.9d, p.getPreco());
	}

}
