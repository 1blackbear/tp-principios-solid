package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import business.carnes.CarneBoi;
import business.carnes.CarnePorco;
import business.carnes.CarneVegana;
import business.pratos.Prato;
import business.pratos.PratoMedio;

class ComidaDecoratorTest {
	
	Prato p;

	@BeforeEach
	void setUp() throws Exception {
		p = new PratoMedio();
	}

	@Test
	@DisplayName("Teste carne boi")
	void testCarneBoi() {
		p = new CarneBoi(p);
		assertEquals("Tamanho m�dio com carne de boi", p.getDescricao());
		assertEquals(20.8d, p.getPreco());
	}
	
	@Test
	@DisplayName("Teste carne porco")
	void testCarnePorco() {
		p = new CarnePorco(p);
		assertEquals("Tamanho m�dio com carne de porco", p.getDescricao());
		assertEquals(18.8d, p.getPreco());
	}
	
	@Test
	@DisplayName("Teste carne vegano")
	void testVegano() {
		p = new CarneVegana(p);
		assertEquals("Tamanho m�dio vegana", p.getDescricao());
		assertEquals(16.8d, p.getPreco());
	}

}
