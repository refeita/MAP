package visitor;

import interfaces.VisitorIF;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public class VisitorDesenha implements VisitorIF{

	@Override
	public double visitaRetangulo(Retangulo r) {
		System.out.println("Desenhando Ret�ngulo!");
		return -1;
	}

	@Override
	public double visitaTriangulo(Triangulo t) {
		System.out.println("Desenhando Tri�ngulo!");
		return -1;
	}

	@Override
	public double visitaCirculo(Circulo c) {
		System.out.println("Desenhando Circulo!");
		return -1;
	}

	@Override
	public double visitaTrapezio(Trapezio c) {
		System.out.println("Desenhando Trap�zio!");
		return -1;
	}
}