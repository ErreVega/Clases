package Main;

import Clases.*;

public class Main11_8 {
    public static void main(String[] args) {
        Figura [] figurasArray = { new Cuadrado(2), new Circulo(1.2), new Triangulo(2),
                                        new Cubo(2), new Esfera(10), new Tetraedro(2)};


        for (int i =  0; i < figurasArray.length; i ++) {
            System.out.println(figurasArray[i]);
        }
    }
}
