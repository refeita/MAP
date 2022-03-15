package test;

import exceptions.ExceptionValorNegativoOuZero;
import figures.Circulo;
import figures.FiguraGeometrica;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class TestCirculo {
    static FiguraGeometrica circulo;
    DecimalFormat df = new DecimalFormat("#.00");  
    //Tem a finalidade de formatar valores decimais. 
    //Ela se baseia em padrões estabelecidos para determinar como os 
    //mesmos valores serão formatados.
    BigDecimal circuloteste;
    @BeforeAll
    public static void setUp() {
        try {
            circulo = new Circulo(3);
        } catch (ExceptionValorNegativoOuZero exceptionValorNegativo) {
            exceptionValorNegativo.printStackTrace();
        }
    }

    @Test
    public void testGetAreaCirculo() {
        circuloteste = new BigDecimal(circulo.getArea()).setScale(2, RoundingMode.HALF_EVEN); 
        //Especifica um comportamento de arredondamento para operações numéricas capazes de descartar precisão.
        //Modo de arredondamento para arredondar para o "vizinho mais próximo", a menos que ambos 
        //os vizinhos sejam equidistantes; nesse caso, arredondar para o vizinho par.
        assertEquals(28.27, circuloteste.doubleValue());
        
        assertEquals(28.27, circulo.getArea(), 1);
    }

    @Test
    public void testGetPerimetroCirculo() {
        circuloteste = new BigDecimal(circulo.getPerimetro()).setScale(2, RoundingMode.HALF_EVEN);
        assertEquals(18.85 , circuloteste.doubleValue());
    }

    @Test
    public void testGetCirculoException() {
        assertThrows(ExceptionValorNegativoOuZero.class, () -> {
            Circulo circuloFail = new Circulo(-2);
            circuloFail.getArea();
            circuloFail.getPerimetro();
        });
    }
}
