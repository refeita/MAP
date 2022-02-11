package main;
import exceptions.ExceptionValorNegativoOuZero;
import figures.Circulo;
import figures.FiguraGeometrica;
import figures.Quadrado;
import figures.Retangulo;

public class BrincandoComAsFigurasGeometricas {
    public static void main(String[] args) {
        try {

            //Criando Formas

            FiguraGeometrica circulo = new Circulo(4);
            FiguraGeometrica quadrado = new Quadrado(4);
            FiguraGeometrica retangulo = new Retangulo(4, 5);

            /*----------------------------------Perimetros-------------------------------------------*/
            System.out.println("Perímetro das figuras geométricas: \n");
            System.out.printf("Perímetro do círculo: %.2f\n", circulo.getPerimetro());
            System.out.printf("Perímetro do quadrado: %.2f\n", quadrado.getPerimetro());
            System.out.printf("Perímetro do retângulo: %.2f\n", retangulo.getPerimetro());

            /*-----------------------------------Areas-----------------------------------------------*/

            System.out.println("Área das figuras geométricas: \n");
            System.out.printf("Área do círculo: %.2f\n", circulo.getArea());
            System.out.printf("Área do quadrado: %.2f\n", quadrado.getArea());
            System.out.printf("Área do retângulo: %.2f\n", retangulo.getArea());

            /*----------------------------------ToStrings----------------------------------------------*/
            System.out.println("\ntoString das figuras geométricas: \n");
            System.out.println(circulo.toString());
            System.out.println(quadrado.toString());
            System.out.println(retangulo.toString());

        } catch (ExceptionValorNegativoOuZero exceptionValorNegativo) {
            exceptionValorNegativo.printStackTrace();
        }

    }
}
