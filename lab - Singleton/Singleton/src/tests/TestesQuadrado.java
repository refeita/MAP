package tests;

import controller.FabricaFiguraGeometrica;
import exceptions.ExceptionValorNegativoOuZero;
import models.FiguraGeometrica;
import models.Quadrado;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestesQuadrado {
    static FiguraGeometrica quadrado, quadrado2;

    //Define os lados do quadrado
    @BeforeAll
    public static void setUp() throws ExceptionValorNegativoOuZero {
        quadrado = FabricaFiguraGeometrica.getQuadrado(4);
        quadrado2 = FabricaFiguraGeometrica.getQuadrado(5);

    }

    //Verifica a area do quadrado
    @Test
    public void testAreaQuadrado() {
        assertEquals(16.00, quadrado.getArea(), 1);
    }

    //Verifica o perimetro do quadrado
    @Test
    public void testPerimetroQuadrado() {
        assertEquals(16.00, quadrado.getPerimetro(), 1);
    }

    //Verifica a area do quadrado2
    @Test
    public void testAreaQuadrado2() {
        assertEquals(25.00, quadrado2.getArea(), 1);
    }

    //Verifica o perimetro do quadrado2
    @Test
    public void testPerimetroQuadrado2() {
        assertEquals(20.00, quadrado2.getPerimetro(), 1);
    }
}
