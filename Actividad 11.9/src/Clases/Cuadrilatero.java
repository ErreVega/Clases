package Clases;

public class Cuadrilatero {

    protected Punto[] puntos;

    public Cuadrilatero(Punto[] puntos) {
        this.puntos = puntos;
    }

    public Cuadrilatero(Punto p1, Punto p2,Punto p3,Punto p4) {
        Punto[] arrayPuntos = { p1, p2, p3, p4};

        this.puntos = arrayPuntos;
    }

//    public double getArea(){
//        this.puntos[0].distancia(this.puntos[1]);
//    }
}
