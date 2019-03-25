package Clases;

public class Tetraedro extends Tridimensional {

    protected double lado;

    public Tetraedro(double lado) {
        this.lado = lado;
    }

    @Override
    public double getVolumen() {
        return  (Math.sqrt(2)* lado * lado * lado  ) / 12;
    }

    @Override
    public double getArea() {
        return  (Math.sqrt(3)* lado * lado ) / 4;
    }
}
