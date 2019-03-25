package Main;


import Clases.Circulo;
import Clases.Forma;

public class PruebaForma {

    public static void main(String[] args) {
        Forma f = new Circulo();
        f.identidad();
        Circulo c = new Circulo();
//        Forma f2 = new Forma();

        System.out.println(
                ((Forma) c).identidad() +
                ((Circulo) f).identidad() +
                ((Forma) f).identidad()
//                f2.identidad()

        );

    }


}

/**
 * Actividad 11.5
 * El upcasting, es transforma el objeto
 *
 * EL programa mostrara siempre "Circulo" cuando se llama al metodo identidad,
 * excepto en el objeto f2 que mostraria "Forma" si la clase fuera instanciable.
 *
 *
 *  http://www.cs.utexas.edu/~cannata/cs345/Class%20Notes/14%20Java%20Upcasting%20Downcasting.htm
 *
 */
