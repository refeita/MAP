package interfaces;

import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public interface VisitorIF {
	
	double visitaRetangulo(Retangulo r);
	double visitaTriangulo(Triangulo t);
	double visitaCirculo(Circulo c);
	double visitaTrapezio(Trapezio t);
	
}