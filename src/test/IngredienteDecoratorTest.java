package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import business.carnes.CarneBoi;
import business.extras.CarneExtra;
import business.extras.Chili;
import business.extras.CremeAlho;
import business.extras.Croutons;
import business.extras.Shitake;
import business.extras.Tofu;
import business.pratos.Prato;
import business.pratos.PratoGrande;

class IngredienteDecoratorTest {
	
	Prato p;

	@BeforeEach
	void setUp() throws Exception {
		p = new PratoGrande();
		p = new CarneBoi(p);
	}

	@Test
	@DisplayName("Carne Extra")
	void testCarneExtra() {
		p = new CarneExtra(p);
		assertEquals("Tamanho grande com carne de boi + Carne extra", p.getDescricao());
		assertEquals(27.8d, p.getPreco());
	}
	
	@Test
	@DisplayName("Creme alho")
	void testCremeAlho() {
		p = new CremeAlho(p);
		assertEquals("Tamanho grande com carne de boi + Créme Alho", p.getDescricao());
		assertEquals(25.3d, p.getPreco());
	}
	
	@Test
	@DisplayName("Chilli")
	void testChilli() {
		p = new Chili(p);
		assertEquals("Tamanho grande com carne de boi + Chilli", p.getDescricao());
		assertEquals(26.3d, p.getPreco());
	}
	
	@Test
	@DisplayName("Croutons")
	void testCroutons() {
		p = new Croutons(p);
		assertEquals("Tamanho grande com carne de boi + Croutons", p.getDescricao());
		assertEquals(25.8d, p.getPreco());
	}
	
	@Test
	@DisplayName("Shitake")
	void testShitake() {
		p = new Shitake(p);
		assertEquals("Tamanho grande com carne de boi + Shitake", p.getDescricao());
		assertEquals(30.7d, p.getPreco());
	}
	
	@Test
	@DisplayName("Tofu")
	void testTofu() {
		p = new Tofu(p);
		assertEquals("Tamanho grande com carne de boi + Tofu", p.getDescricao());
		assertEquals(26.5d, p.getPreco());
	}

}
