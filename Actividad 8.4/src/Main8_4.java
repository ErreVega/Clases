
import clase.ClaseArray;

public class Main8_4 {

    public static void main(String[] args) {


    ClaseArray a1 = new ClaseArray();

    a1.ordenaBurbuja();
    System.out.println("Lineal");
    a1.busquedaLineal(2);
    a1.busquedaLineal(6);
    a1.busquedaLineal(8);
    a1.busquedaLineal(10);

    System.out.println("Dicotómica");
    a1.busquedaDicotomica(1);
    a1.busquedaDicotomica(2);
    a1.busquedaDicotomica(3);
    a1.busquedaDicotomica(4);
    a1.busquedaDicotomica(5);
    a1.busquedaDicotomica(6);
    a1.busquedaDicotomica(7);
    a1.busquedaDicotomica(8);
    a1.busquedaDicotomica(9);
    a1.busquedaDicotomica(10);
    a1.busquedaDicotomica(11);
    a1.busquedaDicotomica(12);
    a1.busquedaDicotomica(13);
    a1.busquedaDicotomica(18);

    }
}
