package Clases;

public abstract class Bidimensional extends Figura{

    public String toString() {
        return this.getClass().getSimpleName() + " = { Area: " + this.getArea() + " }\n";

    }


}
