package Clases;

public class Triangulo extends Bidimensional{

    protected double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {

        return  (Math.sqrt(3)* lado * lado ) / 4;

    }
}
