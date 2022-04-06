package objetos;

import interfaces.ElementoConcretoIF;
import interfaces.VisitorIF;

public class Circulo implements ElementoConcretoIF {

	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public void aceitaVisita(VisitorIF visitor) {
		double result = visitor.visitaCirculo(this);
		if(result != -1)
			System.out.println(result);
	}
}