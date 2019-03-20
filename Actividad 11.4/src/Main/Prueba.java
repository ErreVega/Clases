package Main;

import Clases.*;

public class Prueba {
    public static void main(String[] args) {
        Circulo c = new Circulo("rojo", true);
        Cuadrado cuadrado = new Cuadrado();
        Triangulo t = new Triangulo();
        Rombo rombo = new Rombo();

        System.out.println("" + cuadrado  + c + t + rombo );
        System.out.println(t.identidad());
    }
}
