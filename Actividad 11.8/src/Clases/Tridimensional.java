package Clases;

public abstract class Tridimensional extends Figura{

    public abstract double getVolumen();

    public String toString() {
        return this.getClass().getSimpleName() + " = { Volumen: " + this.getVolumen() +
                ", Area: " + this.getArea() + " }\n";

    }


}
