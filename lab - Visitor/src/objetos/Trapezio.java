package objetos;

import interfaces.ElementoConcretoIF;
import interfaces.VisitorIF;

public class Trapezio implements ElementoConcretoIF{

	private double baseMenor;
	private double baseMaior;
	private double tamLados;
	private double altura;
	
	public Trapezio(double baseMenor, double baseMaior, double tamLados, double altura) {
		this.baseMenor = baseMenor;
		this.baseMaior = baseMaior;
		this.tamLados = tamLados;
		this.altura = altura;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}

	public double getTamLados() {
		return tamLados;
	}

	public void setTamLados(double tamLados) {
		this.tamLados = tamLados;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void aceitaVisita(VisitorIF visitor) {
		double result = visitor.visitaTrapezio(this);
		if(result != -1)
			System.out.println(result);
	}
}