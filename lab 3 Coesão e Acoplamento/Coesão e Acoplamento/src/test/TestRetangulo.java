package test;

import exceptions.ExceptionValorNegativoOuZero;
import figures.FiguraGeometrica;
import figures.Retangulo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestRetangulo {
    
    static FiguraGeometrica retangulo;
    static FiguraGeometrica retangulo2;
    BigDecimal retanguloteste;
    @BeforeAll
    public static void setUp() {
        try {
            retangulo = new Retangulo(3, 4);
            retangulo2 = new Retangulo(2.2, 3.1);
        } catch (ExceptionValorNegativoOuZero exceptionValorNegativo) {
            exceptionValorNegativo.printStackTrace();
        }

    }

    @Test
    public void testGetAreaRetangulo() {
        assertEquals(12.00, retangulo.getArea());
    }

    @Test
    public void testGetPerimetroRetangulo() {
        assertEquals(14.00, retangulo.getPerimetro());
    }

    @Test
    public void testGetRetanguloException() {
        assertThrows(ExceptionValorNegativoOuZero.class, () -> {
            Retangulo retanguloFail = new Retangulo(-2,0);
            retanguloFail.getArea();
            retanguloFail.getPerimetro();
        });
    }

    @Test
    public void testGetAreaRetangulo2() {
        retanguloteste = new BigDecimal(retangulo2.getArea()).setScale(2, RoundingMode.HALF_EVEN);
        assertEquals(6.82, retanguloteste.doubleValue());
    }

    @Test
    public void testGetPerimetroRetangulo2() {
        retanguloteste = new BigDecimal(retangulo2.getPerimetro()).setScale(2, RoundingMode.HALF_EVEN);
        assertEquals(10.6, retanguloteste.doubleValue());
    }



}

