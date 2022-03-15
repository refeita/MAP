package models;

import exceptions.ExceptionValorNegativoOuZero;

public class Circulo implements FiguraGeometrica {
    private static Circulo instancia = null;
    private double raio;

    // Exception
    public static Circulo getInstancia(double raio) throws ExceptionValorNegativoOuZero {
        if (instancia == null){
            instancia = new Circulo(raio);
        }
        return instancia;
    }

    // Construtor
    private Circulo(double raio) throws ExceptionValorNegativoOuZero {
        if (raio <= 0) {
            throw new ExceptionValorNegativoOuZero();
        }
        this.raio = raio;
    }

    // Gets e Sets
    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return "Circulo com raio de tamanho: " + raio;
    }
}
