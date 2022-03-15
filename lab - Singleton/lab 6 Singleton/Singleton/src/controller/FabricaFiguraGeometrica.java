package controller;

import exceptions.ExceptionValorNegativoOuZero;
import models.Circulo;
import models.Quadrado;
import models.Triangulo;

public class FabricaFiguraGeometrica {
    
    public static Circulo getCirculo(double raio) throws ExceptionValorNegativoOuZero {
        return Circulo.getInstancia(raio);
    }

    public static Quadrado getQuadrado(double lado) throws ExceptionValorNegativoOuZero {
        return new Quadrado(lado);
    }

    public static Triangulo getTriangulo(double lado1, double lado2, double lado3) throws ExceptionValorNegativoOuZero {
        return Triangulo.getInstancias(lado1, lado2, lado3);
    }



}
