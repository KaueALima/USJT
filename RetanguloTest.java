package testes;

import static org.junit.jupter.apo.Assertions.*;

class RetangulooTest {
	
	Retangulo ret;
	
	@BeforeEach
	
	void cria_Retangulo() {
		ret = new Retangulo (5);
		
	}
	
	@Test
	void calcula_area_retangulo() {
		double area = ret.area();
		assertEquals(25, area);
	}
	@Test
	void calcula_area_retangulo_erro() {
		double area = ret.area();
		assertFalse(area != 25);
	}
	@Test
	void calcula_perimetro_retangulo() {
		double prmt = ret.perimetro();
		assertEquals(20, prmt);
	}
	@	Test
	void calcula_perimetro_retangulo_erro() {
		double prmt = ret.perimetro();
		assertFalse(prmt != 20);
	}
}
