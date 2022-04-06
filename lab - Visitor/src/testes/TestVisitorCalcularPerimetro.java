package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import interfaces.VisitorIF;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;
import visitor.VisitorCalculaPerimetro;

class TestVisitorCalcularPerimetro {

	static VisitorIF visitor;

	static Circulo circulo;
	static Triangulo triangulo;
	static Retangulo retangulo;
	static Trapezio trapezio;
	
	@BeforeAll
	static void init(){
		visitor = new VisitorCalculaPerimetro();
		
		circulo = new Circulo(5);
		triangulo = new Triangulo(7, 3);
		retangulo = new Retangulo(10, 5);
		trapezio = new Trapezio(5, 8, 4, 3);
	}

	@Test
	void calcularPerimetroCirculo() {
		double expected = 31.41592653589793;
		assertEquals(expected, visitor.visitaCirculo(circulo));
	}
	
	@Test
	void calcularPerimetroTriangulo() {
		double expected = 17.61577310586391;
		assertEquals(expected, visitor.visitaTriangulo(triangulo));
	}
	
	@Test
	void calcularPerimetroRetangulo() {
		double expected = 30.0;
		assertEquals(expected, visitor.visitaRetangulo(retangulo));
	}
	
	@Test
	void calcularPerimetroTrapezio() {
		double expected = 21.0;
		assertEquals(expected, visitor.visitaTrapezio(trapezio));
	}
}