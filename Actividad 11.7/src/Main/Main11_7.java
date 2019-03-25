package Main;

import Clases.*;

public class Main11_7 {

    public static void main(String[] args) {
        Sorteo  obj = new Moneda();
//              obj = new Dado();

        for (int i = 0; i < 20 ; i ++){
            System.out.println(obj.lanzar());
        }

    }
}
