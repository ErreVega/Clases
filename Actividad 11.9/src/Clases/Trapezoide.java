package Clases;

public class Trapezoide extends Cuadrilatero {
    public Trapezoide() {
    }

    public Trapezoide(Punto a, Punto b, Punto c, Punto d) {
        super(a, b, c, d);
    }

    public double getArea(){
        double  resultado,
                resTriACD,
                resTriACB;

        resTriACB = (a.getCoorX() * (b.getCoorY()- c.getCoorY())) +
                    (b.getCoorX() * (c.getCoorY()- a.getCoorY())) +
                    (c.getCoorX() * (a.getCoorY()- b.getCoorY()));
        resTriACB = resTriACB / 2;

        if (resTriACB < 0)
            resTriACB = resTriACB * (-1);

        resTriACD = (a.getCoorX() * (d.getCoorY()- c.getCoorY())) +
                    (d.getCoorX() * (c.getCoorY()- a.getCoorY())) +
                    (c.getCoorX() * (a.getCoorY()- d.getCoorY()));
        resTriACD = resTriACD / 2;

        if (resTriACD < 0)
            resTriACD = resTriACD * (-1);

        resultado = resTriACB + resTriACD;
        return resultado;
    }
}
