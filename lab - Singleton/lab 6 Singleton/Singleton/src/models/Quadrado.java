package models;

import exceptions.ExceptionValorNegativoOuZero;

public class Quadrado implements FiguraGeometrica {
    private double lado;

    public Quadrado(double lado) throws ExceptionValorNegativoOuZero {
        if (lado <= 0) throw new ExceptionValorNegativoOuZero();
        this.lado = lado;
    }

    //Get e set
    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public double getPerimetro() {
        return 4 * lado;
    }

    @Override
    public String toString() {
        return "Quadrado com lados de tamanho: " + lado;
    }
}
