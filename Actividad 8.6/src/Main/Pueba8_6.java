package Main;

import java.util.Scanner;
import Clases.Lista;

public class Pueba8_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion, valor;
        Lista l1 = new Lista();
        String menu = (
                        "\n1. INSERTAR NODO PRINCIPIO" +
                        "\n2. INSERTAR NODO FINAL" +
                        "\n3. BORRAR UN NODO" +
                        "\n4. BUSCAR UN NODO" +
                        "\n5. MOSTRAR LA LISTA" +
                        "\n6.FIN"
        );

        String preguntaValor = (
                        "\nINTRODUCE VALOR: "
                );

        do {
            System.out.println(menu);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(preguntaValor);
                    valor = sc.nextInt();
                    l1.insertaPrincipio(valor);
                    break;
                case 2:
                    System.out.println(preguntaValor);
                    valor = sc.nextInt();
                    l1.insertarFinal(valor);
                    break;
                case 3:
                    System.out.println(preguntaValor);
                    valor = sc.nextInt();
                    l1.borrarNodo(valor);
                    break;
                case 4:
                    System.out.println(preguntaValor);
                    valor = sc.nextInt();
                    System.out.println(l1.buscaNodo(valor));
                    break;
                case 5:
                    System.out.println(l1);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }
        } while (opcion != 6);




    }
}
