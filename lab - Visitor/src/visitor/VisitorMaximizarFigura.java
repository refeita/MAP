package visitor;

import interfaces.VisitorIF;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public class VisitorMaximizarFigura implements VisitorIF {

	@Override
	public double visitaRetangulo(Retangulo r) {
		r.setAltura(r.getAltura() * 2);
		r.setBase(r.getBase() * 2);
		System.out.println("Retângulo maximizado!");
		return -1;
	}

	@Override
	public double visitaTriangulo(Triangulo t) {
		t.setAltura(t.getAltura() * 2);
		t.setBase(t.getBase() * 2);
		System.out.println("Triângulo maximizado!");
		return -1;
	}

	@Override
	public double visitaCirculo(Circulo c) {
		c.setRaio(c.getRaio() * 2);
		System.out.println("Circulo maximizado!");
		return -1;
	}

	@Override
	public double visitaTrapezio(Trapezio c) {
		c.setBaseMaior(c.getBaseMaior() * 2);
		c.setBaseMenor(c.getBaseMenor() * 2);
		c.setAltura(c.getAltura() * 2);
		c.setTamLados(c.getTamLados() * 2);
		System.out.println("Trapézio maximizado!");
		return -1;
	}
}