package test;

import exceptions.ExceptionValorNegativoOuZero;
import figures.FiguraGeometrica;
import figures.Quadrado;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestQuadrado {
    
    static FiguraGeometrica quadrado;
    static FiguraGeometrica quadrado2;
    BigDecimal quadradoteste;
    @BeforeAll
    public static void setUp() {
        try {
            quadrado = new Quadrado(4);
            quadrado2 = new Quadrado(2.2);
        } catch (ExceptionValorNegativoOuZero exceptionValorNegativo) {
            exceptionValorNegativo.printStackTrace();
        }

    }

    @Test
    public void testGetAreaQuadrado() {
        assertEquals(16.00, quadrado.getArea());
    }

    @Test
    public void testGetPerimetroQuadrado() {
        assertEquals(16.00, quadrado.getPerimetro());
    }

    @Test
    public void testGetQuadradoException() {
        assertThrows(ExceptionValorNegativoOuZero.class, () -> {
            Quadrado quadradoFail = new Quadrado(-2);
            quadradoFail.getArea();
            quadradoFail.getPerimetro();
        });
    }

    @Test
    public void testGetAreaQuadrado2() {
        quadradoteste = new BigDecimal(quadrado2.getArea()).setScale(2, RoundingMode.HALF_EVEN);
        assertEquals(4.84, quadradoteste.doubleValue());
    }

    @Test
    public void testGetPerimetroQuadrado2() {
        quadradoteste = new BigDecimal(quadrado2.getPerimetro()).setScale(2, RoundingMode.HALF_EVEN);
        assertEquals(8.8, quadradoteste.doubleValue());
    }



}

