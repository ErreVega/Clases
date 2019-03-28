package Clases;

public class Cuadrado extends Cuadrilatero {
    public Cuadrado() {
    }

    public Cuadrado(Punto a, Punto b, Punto c, Punto d) {
        super(a, b, c, d);
    }

    public double getArea(){
        double resultado;
        resultado = a.distancia(b) * b.distancia(c);
        return resultado;
    }


}
