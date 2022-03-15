package tests;

import controller.FabricaFiguraGeometrica;
import exceptions.ExceptionValorNegativoOuZero;
import models.FiguraGeometrica;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestesTriangulo {
    static FiguraGeometrica triangulo;

    //Definindo os lados do triangulo
    @BeforeAll
    public static void setUp() throws ExceptionValorNegativoOuZero {
        triangulo = FabricaFiguraGeometrica.getTriangulo(3, 4, 5);
    }

    //Verifica a area do triangulo
    @Test
    public void testAreaTriangulo() {
        assertEquals(6.00, triangulo.getArea(), 1);
    }

    //Verifica o perimetro do triangulo
    @Test
    public void testPerimetroTriangulo() {
        assertEquals(12.00, triangulo.getPerimetro(), 1);
    }

    //Testa se a figura  é um triangulo
    @Test
    public void testTriangulo() throws ExceptionValorNegativoOuZero {
        assertNotNull(FabricaFiguraGeometrica.getTriangulo(3, 4, 5));
    }

    @Test
    public void testTriangulo2() throws ExceptionValorNegativoOuZero {
        assertNotNull(FabricaFiguraGeometrica.getTriangulo(5, 5, 5));
    }

    //Testa se o triangulo é equilatero
    @Test
    public void testTrianguloEquilatero() throws ExceptionValorNegativoOuZero {
        assertNotNull(FabricaFiguraGeometrica.getTriangulo(10, 10, 10));
    }

    @Test
    public void testTrianguloEquilatero2() throws ExceptionValorNegativoOuZero {
        assertNotNull(FabricaFiguraGeometrica.getTriangulo(3, 3, 3));
    }

    //Testa se o triangulo é Isosceles
    @Test
    public void testTrianguloIsosceles1() throws ExceptionValorNegativoOuZero {
        assertNotNull(FabricaFiguraGeometrica.getTriangulo(4, 3, 4));
    }

    @Test
    public void testTrianguloIsosceles2() throws ExceptionValorNegativoOuZero {
        assertNotNull(FabricaFiguraGeometrica.getTriangulo(10, 10, 6));

    }

    //Testa se o triangulo é Retangulo
    @Test
    public void testTrianguloRetangulo1() throws ExceptionValorNegativoOuZero {
        assertNotNull(FabricaFiguraGeometrica.getTriangulo(18, 24, 30));
    }

    @Test
    public void testTrianguloRetangulo2() throws ExceptionValorNegativoOuZero {
        assertNotNull(FabricaFiguraGeometrica.getTriangulo(7, 24, 25));
    }
}