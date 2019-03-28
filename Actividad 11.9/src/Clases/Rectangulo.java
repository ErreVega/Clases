package Clases;

public class Rectangulo extends Cuadrilatero{
    public Rectangulo() {
    }

    public Rectangulo(Punto a, Punto b, Punto c, Punto d) {
        super(a, b, c, d);
    }
    public double getArea(){
        double resultado;
        resultado = a.distancia(b) * b.distancia(c);
        return resultado;
    }
}
