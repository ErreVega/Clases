package Clases;

public class Cuadrado extends Bidimensional {
    protected double lado;


    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }
}
