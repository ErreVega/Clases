package Clases;

public class Circulo extends Bidimensional {

    protected double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double getArea() {
        double res = Math.PI * radio * radio;
        return res;
    }
}
