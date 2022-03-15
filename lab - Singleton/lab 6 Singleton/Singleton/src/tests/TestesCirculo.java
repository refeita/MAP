package tests;

import controller.FabricaFiguraGeometrica;
import exceptions.ExceptionValorNegativoOuZero;
import models.FiguraGeometrica;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestesCirculo{
    static FiguraGeometrica circulo;

    //Definindo o raio do circulo
    @BeforeAll
    public static void setUp() throws ExceptionValorNegativoOuZero {
        circulo = FabricaFiguraGeometrica.getCirculo(5);
    }

    @Test
    //verifica a area do cirulo
    public void testAreaCirculo(){
        assertEquals(78.54, circulo.getArea(), 1);
    }

    @Test
    //Verifica o perimeto do circulo
    public void testPerimetroCirculo(){
        assertEquals(31.42, circulo.getPerimetro(), 1);
    }
}