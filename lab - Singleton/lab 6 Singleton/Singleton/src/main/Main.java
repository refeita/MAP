package main;

import models.FiguraGeometrica;
import controller.FabricaFiguraGeometrica;
import exceptions.ExceptionValorNegativoOuZero;

public class Main{
    static FiguraGeometrica equilatero;
    static FiguraGeometrica isosceles;
    static FiguraGeometrica escaleno;
    static FiguraGeometrica circulo;
    static FiguraGeometrica quadrado1;
    static FiguraGeometrica quadrado2;
    static FiguraGeometrica quadrado3;
    static FiguraGeometrica quadrado4;

    public static void main(String[] args) throws ExceptionValorNegativoOuZero {

        equilatero = FabricaFiguraGeometrica.getTriangulo(10, 10, 10);
        isosceles = FabricaFiguraGeometrica.getTriangulo(10, 10, 6);
        escaleno = FabricaFiguraGeometrica.getTriangulo(3, 4, 5);

        circulo = FabricaFiguraGeometrica.getCirculo(5);

        quadrado1 = FabricaFiguraGeometrica.getQuadrado(4);
        quadrado2 = FabricaFiguraGeometrica.getQuadrado(5);
        quadrado3 = FabricaFiguraGeometrica.getQuadrado(8);
        quadrado4 = FabricaFiguraGeometrica.getQuadrado(10);

        //Cria circulo---------------------------------------------------------------------------
        printLine();
        System.out.println("\n" + circulo);
        System.out.printf("Área: %.2f\n", circulo.getArea());
        System.out.printf("Perímetro: %.2f\n", circulo.getPerimetro());

        printLine();

        //Cria triangulos-------------------------------------------------------------------------
        System.out.println("\n" + equilatero);
        System.out.printf("Área: %.2f\n", equilatero.getArea());
        System.out.printf("Perímetro: %.2f\n", equilatero.getPerimetro());

        System.out.println("\n" + isosceles);
        System.out.printf("Área: %.2f\n", isosceles.getArea());
        System.out.printf("Perímetro: %.2f\n", isosceles.getPerimetro());

        System.out.println("\n" + escaleno);
        System.out.printf("Área: %.2f\n", escaleno.getArea());
        System.out.printf("Perímetro: %.2f\n", escaleno.getPerimetro());

        printLine();

        //Cria quadrados------------------------------------------------------------------------------
        System.out.println("\n" + quadrado1);
        System.out.printf("Área: %.2f\n", quadrado1.getArea());
        System.out.printf("Perímetro: %.2f\n", quadrado1.getPerimetro());

        System.out.println("\n" + quadrado2);
        System.out.printf("Área: %.2f\n", quadrado2.getArea());
        System.out.printf("Perímetro: %.2f\n", quadrado2.getPerimetro());

        System.out.println("\n" + quadrado3);
        System.out.printf("Área: %.2f\n", quadrado3.getArea());
        System.out.printf("Perímetro: %.2f\n", quadrado3.getPerimetro());

        System.out.println("\n" + quadrado4);
        System.out.printf("Área: %.2f\n", quadrado4.getArea());
        System.out.printf("Perímetro: %.2f\n", quadrado4.getPerimetro());
        printLine();
    }

    //Usado para organizar o codigo, vai printar "__" onde for chamado
    private static void printLine () {
        System.out.println("_________________________________________________________________________________________");
    }
}