package Clases;

public class Paralelogramo extends Cuadrilatero {
    public Paralelogramo() {
    }

    public Paralelogramo(Punto a, Punto b, Punto c, Punto d) {
        super(a, b, c, d);
    }

    public double getArea(){

        double resultado;
        Punto r1 = a.resta(b);
        Punto r2 = d.resta(b);

        resultado = (r1.getCoorX() * r2.getCoorY()) - (r1.getCoorY() * r2.getCoorX());

        if (resultado < 0)
            resultado = resultado * (-1);

        return resultado;
    }
}
