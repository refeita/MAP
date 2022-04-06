package visitor;

import interfaces.VisitorIF;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public class VisitorCalculaPerimetro implements VisitorIF{

	@Override
	public double visitaRetangulo(Retangulo r) {
		return 2 * (r.getAltura() + r.getBase());
	}

	@Override
	public double visitaTriangulo(Triangulo t) {
		double hip = Math.sqrt(Math.pow(t.getBase(), 2) + Math.pow(t.getAltura(), 2));
		return t.getBase() + t.getAltura() + hip;
	}

	@Override
	public double visitaCirculo(Circulo c) {
		return 2 * Math.PI * c.getRaio();
	}

	@Override
	public double visitaTrapezio(Trapezio t) {
		return t.getBaseMaior() + t.getBaseMenor() + t.getTamLados() * 2;
	}
}