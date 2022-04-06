package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import interfaces.VisitorIF;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;
import visitor.VisitorMaximizarFigura;

class TestVisitorMaximixarFigura {

	static VisitorIF visitor;

	static Circulo circulo = new Circulo(5);
	static Triangulo triangulo = new Triangulo(7, 3);
	static Retangulo retangulo = new Retangulo(10, 5);
	static Trapezio trapezio = new Trapezio(5, 8, 4, 3);
	
	@BeforeAll
	static void init(){
		visitor = new VisitorMaximizarFigura();
		
		visitor.visitaCirculo(circulo);
		visitor.visitaTriangulo(triangulo);
		visitor.visitaRetangulo(retangulo);
		visitor.visitaTrapezio(trapezio);
	}
	
	@Test
	void testRaioCirculoMaximizado() {
		double expected = 10;
		assertEquals(expected, circulo.getRaio());
	}
	
	@Test
	void testBaseTrianguloMaximizado() {
		double expected = 14;
		assertEquals(expected, triangulo.getBase());
	}
	
	@Test
	void testAlturaTrianguloMaximizado() {
		double expected = 6;
		assertEquals(expected, triangulo.getAltura());
	}
	
	@Test
	void testBaseRetanguloMaximizado() {
		double expected = 20;
		assertEquals(expected, retangulo.getBase());
	}
	
	@Test
	void testAlturaRetanguloMaximizado() {
		double expected = 10;
		assertEquals(expected, retangulo.getAltura());
	}
	
	@Test
	void testBaseMenorTrapezioMaximizado() {
		double expected = 10;
		assertEquals(expected, trapezio.getBaseMenor());
	}
	
	@Test
	void testBaseMaiorTrapezioMaximizado() {
		double expected = 16;
		assertEquals(expected, trapezio.getBaseMaior());
	}
	
	@Test
	void testTamLadosTrapezioMaximizado() {
		double expected = 8;
		assertEquals(expected, trapezio.getTamLados());
	}
	
	@Test
	void testAlturaTrapezioMaximizado() {
		double expected = 6;
		assertEquals(expected, trapezio.getAltura());
	}
}