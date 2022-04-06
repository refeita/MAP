package principal;

import interfaces.ElementoConcretoIF;
import interfaces.VisitorIF;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;
import visitor.VisitorCalculaArea;
import visitor.VisitorCalculaPerimetro;
import visitor.VisitorDesenha;
import visitor.VisitorMaximizarFigura;

public class Main {
	
	public static void main(String[] args) {
		
		VisitorIF visitorCA = new VisitorCalculaArea();
		VisitorIF visitorCP = new VisitorCalculaPerimetro();
		VisitorIF visitorD  = new VisitorDesenha();
		VisitorIF visitorMF = new VisitorMaximizarFigura();
 		
		ElementoConcretoIF circulo = new Circulo(5);
		ElementoConcretoIF triangulo = new Triangulo(7, 3);
		ElementoConcretoIF retangulo = new Retangulo(10, 5);
		ElementoConcretoIF trapezio = new Trapezio(5, 8, 4, 3);
		
		VisitorIF[] visitors = new VisitorIF[] {visitorCA, visitorCP, visitorD, visitorMF};
		
		for(VisitorIF visitor : visitors) {
			System.out.println(visitor.getClass().getName());
			System.out.print("Circulo  : ");
			circulo.aceitaVisita(visitor);
			System.out.print("Triângulo: ");
			triangulo.aceitaVisita(visitor);
			System.out.print("Retângulo: ");
			retangulo.aceitaVisita(visitor);
			System.out.print("Trapézio : ");
			trapezio.aceitaVisita(visitor);
			System.out.println();
		}
	}
}