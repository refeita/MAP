package models;

import exceptions.ExceptionValorNegativoOuZero;

import java.util.Arrays;

public class Triangulo implements FiguraGeometrica {

    private static Triangulo[] instancias = {null, null, null};
    protected double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3) throws ExceptionValorNegativoOuZero {
            if (lado1 <=0 || lado2 <=0 || lado3 <=0 ) {
            throw new ExceptionValorNegativoOuZero();
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Gets e sets -------------------------------------------------------------------
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    //--------------------------------------------------------------------------------------------

    public static Triangulo getInstancias(double lado1, double lado2, double lado3) throws ExceptionValorNegativoOuZero {
        if (!verificacaoTriangulo(lado1, lado2, lado3)) {
            return null;
        }

        if (verificacaoTRetangulo(lado1, lado2, lado3)) {
            if (instancias[2] == null) instancias[2] = new Triangulo(lado1, lado2, lado3);
            return instancias[2];
        }

        if (verificacaoTEquilatero(lado1, lado2, lado3)) {
            if (instancias[1] == null) instancias[1] = new Triangulo(lado1, lado2, lado3);
            return instancias[1];
        }

        if (verificacaoTIsosceles(lado1, lado2, lado3)){
            if (instancias[0] == null) instancias[0] = new Triangulo(lado1, lado2, lado3);
            return instancias[0];
        }
        return null;
    }

    // Verifica se a figura é um triangulo (hipotenusa menor que a soma dos outros 2 lados)
    private static boolean verificacaoTriangulo(double lado1, double lado2, double lado3) {
        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
            return true;
        }
        return false;
    }

    // Verifica se a figura é um  triangulo retangulo (A² + B² = C²)
    private static boolean verificacaoTRetangulo(double lado1, double lado2, double lado3){
        double[] array = {lado1, lado2, lado3};
        Arrays.sort(array);
        lado1 = array[0];
        lado2 = array[1];
        lado3 = array[2];
        if(Math.pow(lado1, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2)){
            return true;
        }
        return false;
    }

    // Verifica se a figura é um  triangulo equilatero (todos os lados iguais)
    private static boolean verificacaoTEquilatero(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return true;
        }
        return false;
    }

    // Verifica se a figura é um  triangulo isosceles (2 lados iguais)
    private static boolean verificacaoTIsosceles(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return true;
        }
        return false;
    }

    //Soma dos lados / 3
    @Override
    public double getArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s*(s- lado1)*(s- lado2)*(s- lado3));
    }

    @Override
    public double getPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public String toString() {
        return "Os lados do triangulo sao iguais a: " + lado1 +"," + lado2 +"," + lado3;
    }
}
