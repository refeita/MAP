package objetos;

import interfaces.ElementoConcretoIF;
import interfaces.VisitorIF;

public class Retangulo implements ElementoConcretoIF{
	
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void aceitaVisita(VisitorIF visitor) {
		double result = visitor.visitaRetangulo(this);
		if(result != -1)
			System.out.println(result);
	}
}