package Main;

import Clases.*;

public class Main11_9 {
    public static void main(String[] args) {

    Punto a = new Punto(0, 0);
    Punto b = new Punto(3, 0);
    Punto c = new Punto(3, 3);
    Punto d = new Punto(0, 3);

    Cuadrilatero cua1 = new Cuadrado(a,b,c,d);

    Punto a2 = new Punto(6, 6);
    Punto b2 = new Punto(6, 2);
    Punto c2 = new Punto(0, 0);
    Punto d2 = new Punto(0, 4);

    Cuadrilatero cua2 = new Paralelogramo(a2,b2,c2,d2);

    Punto a3 = new Punto(0, 0);
    Punto b3 = new Punto(4, 0);
    Punto c3 = new Punto(4, 2);
    Punto d3 = new Punto(0, 2);

    Cuadrilatero cua3 = new Rectangulo(a3,b3,c3,d3);

    Punto a4 = new Punto(-2, 0);
    Punto b4 = new Punto(3, 1);
    Punto c4 = new Punto(0, 5);
    Punto d4 = new Punto(-3, 4);

    Cuadrilatero cua4 = new Trapezoide(a4,b4,c4,d4);


        System.out.println(
                ((Cuadrado) cua1).getArea() + "\n"+
                ((Paralelogramo) cua2).getArea() + "\n"+
                ((Rectangulo) cua3).getArea() + "\n"+
                ((Trapezoide) cua4).getArea() + "\n"
        );


    }
}
