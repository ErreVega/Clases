package Main;

import Clases.ListaOrdenada;
import Clases.Producto;
import java.util.Scanner;

public class Main8_7 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        ListaOrdenada l1 = new ListaOrdenada();

        String menu = (

                "\n" +
                        "1. INSERTAR PRODUCTO\n" +
                        "2. BORRAR UN PRODUCTO\n" +
                        "3. BUSCAR UN PRODUCTO\n" +
                        "4. MOSTRAR LA LISTA\n" +
                        "5. FIN\n"
        );

        String producto = ("\nIntroduce numero de producto.");

        int opcion, nProd;
        float precio;
        String subOp, descripcion;
        Producto p1;
        Producto p2 = new Producto(2, 20);
        Producto p3 = new Producto(3,30);
        Producto p4 = new Producto(4,40);

        l1.insertar(p2);
        l1.insertar(p3);
        l1.insertar(p4);

        do {


            System.out.println(menu);
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println(producto);
                    nProd = sc.nextInt();
                    sc.nextLine();


                    System.out.println("\nIntroduce Precio.");
                    precio = sc.nextFloat();
                    sc.nextLine();
                    do {
                        System.out.println("\n¿Quiere introducir descripcion del producto? (S/N)");
                        subOp = sc.nextLine();
                        switch (subOp.trim()) {
                            case "S":
                            case "s":
                                System.out.println("\nIntroduzca descripcion.");
                                descripcion = sc.nextLine();
                                p1 = new Producto(nProd, descripcion, precio);
                                break;
                            case "N":
                            case "n":
                                p1 = new Producto(nProd, precio);
                                break;

                            default:
                                System.out.println("Caracter no reconocido.");
                        }

                    } while (!subOp.equalsIgnoreCase("s") && !subOp.equalsIgnoreCase("n"));
                    p1 = new Producto(nProd, precio);
                    System.out.println(l1.insertar(p1));
                    break;


                case 2:
                    System.out.println(producto);
                    nProd = sc.nextInt();
                    sc.nextLine();

                    System.out.println(l1.borrarNodo(nProd));
                    break;

                case 3:
                    System.out.println(producto);
                    nProd = sc.nextInt();
                    sc.nextLine();

                    System.out.println(l1.buscaNodo(nProd));
                    break;

                case 4:
                    System.out.println(l1);
                    break;
                case 5:
                    break;


                default:
                    System.out.println("\nOpcion no valida.");
                    break;


            }
        } while (opcion != 5);
    }
}






