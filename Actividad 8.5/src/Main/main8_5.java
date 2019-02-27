package Main;

import java.util.Scanner;

import Class.*;

public class main8_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion, valor;

        /**
         * Se declara el objeto cola como clase Estructura de almacenamiento, la cual despues segun se elija
         * se iniciara y construira como Cola o Pila (clases heredadas).
         */
        EstructuraAlmacenamiento objeto1 = new EstructuraAlmacenamiento();

        String menu = (

                "0. Mostrar el contenido de la estructura.\n" +
                        "1. Push: insertar un elemento comprobando que la estructura no está llena\n" +
                        "2. Pop: sacar un elemento (y mostrarlo) comprobando que la estructura no está vacía\n" +
                        "3. Delete: borrará todos los elementos\n" +
                        "4. Fin\n"
        );

        String submenu = (

                "Introduce un valor: "

        );

        String elemento = (
                "Los elementos se organizaran en: \n" +
                        "1. Una Pila.\n" +
                        "2. Una Cola\n");
        do {
            System.out.println(elemento);
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    objeto1 = new Pila();
                    break;
                case 2:
                    objeto1 = new Cola();
                    break;
                default:
                    System.out.println("\nOpcion incorrecta\n" + elemento);
            }
        } while (opcion != 1 && opcion != 2);

        do {
            System.out.println(menu);
            opcion = scanner.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println(objeto1);
                    break;
                case 1:
                    System.out.println(submenu);
                    valor = scanner.nextInt();
                    System.out.println(objeto1.push(valor));
                    break;
                case 2:
                    System.out.println(objeto1.pop());
                    break;
                case 3:
                    objeto1.delete();
                    break;
                case 4:
                    break;

                default:
                    System.out.println("Opcion introducida no válida.");
                    break;
            }
        } while (opcion != 4);


    }
}
