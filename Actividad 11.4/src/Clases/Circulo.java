package Clases;

public class Circulo extends Forma {

    public Circulo(String color, boolean relleno) {
        super(color, relleno);
    }

    public Circulo() {
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "color='" + color + '\'' +
                ", relleno=" + relleno +
                '}';
    }
}
