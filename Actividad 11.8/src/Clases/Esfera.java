package Clases;

public class Esfera extends Tridimensional {

    protected double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    public double getVolumen() {
        return (4/3) * Math.PI * radio * radio * radio;
    }

    @Override
    public double getArea() {
        return Math.PI * 4 * radio * radio;
    }
}
