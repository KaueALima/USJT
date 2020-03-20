package testes;

import static org.junit.jupter.apo.Assertions.*;

class CirculoTest {
	
	Circulo circ;
	
	@BeforeEach
	
	void cria_Circulo() {
		circ = new Circulo (3);
		
	}
	
	@Test
	void calcula_area_circulo() {
		double area = circ.area();
		assertEquals(28.274333882308138, area);
	}
	@Test
	void calcula_area_circulo_erro() {
		double area = circ.area();
		assertFalse(area != 9.237187381783);
	}
	@Test
	void calcula_perimetro_circulo_erro() {
		double prmt = circ.perimetro();
		assertEquals(81.235245, prmt);
	}
	@	Test
	void calcula_perimetro_circulo() {
		double prmt = circ.perimetro();
		assertTrue(prmt == 18.84955592153876);
	}
}
