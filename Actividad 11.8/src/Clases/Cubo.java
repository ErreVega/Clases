package Clases;

public class Cubo extends Tridimensional {

    protected double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double getVolumen() {
        return lado * lado * lado;
    }

    @Override
    public double getArea() {
        return lado * lado ;
    }
}
