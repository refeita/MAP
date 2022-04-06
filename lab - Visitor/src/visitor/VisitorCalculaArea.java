package visitor;

import interfaces.VisitorIF;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public class VisitorCalculaArea implements VisitorIF{

	@Override
	public double visitaRetangulo(Retangulo r) {
		return r.getAltura() * r.getBase();
	}

	@Override
	public double visitaTriangulo(Triangulo t) {
		return (t.getAltura() * t.getBase()) / 2;
	}

	@Override
	public double visitaCirculo(Circulo c) {
		return Math.PI * (c.getRaio() * c.getRaio());
	}

	@Override
	public double visitaTrapezio(Trapezio t) {
		return ((t.getBaseMaior() + t.getBaseMenor()) * t.getAltura()) / 2;
	}
}