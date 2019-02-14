import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion, valor = 0;
        ArrayOrd a1 = new ArrayOrd();



        String menu = (

                          "0- MOSTRAR LOS ELEMENTOS NO NULOS DEL ARRAY.                                     \n"
                        + "1- INSERTAR UN VALOR (enteros positivos que deben validarse)                     \n"
                        + "2- BORRAR ELEMENTO DADO SU VALOR (si hay varios borrará solo el primero de ellos)\n"
                        + "3- BORRAR TODOS LOS ELEMENTOS DADO SU VALOR                                      \n"
                        + "4- FIN                                                                           \n"
                        + "Introduce la opcion que desee: ");


        String subMenu = (

                "\nIntroduce Valor: ");

        do {
            System.out.println(menu);
            opcion = sc.nextInt(); sc.nextLine();
            if (!(opcion == 0 || opcion == 4)) {
                System.out.println(subMenu);
                valor = sc.nextInt(); sc.nextLine();
            }


            String r = "\n";
            switch (opcion) {
                case 0:
                    System.out.println(a1);

                    break;

                case 1:
                    a1.insertar(valor);

                    r = r + "Valor " + valor + " insertado.";
                    break;

                case 2:
                    if (a1.borrarValor(valor))
                        r = r + "Valor " + valor + " borrado.";
                    else
                        r = r + "Valor introducido no encontrado.";
                    break;

                case 3:
                    r = r + "Valor eliminado " + a1.borrarTodosValor(valor) + " veces.";
                    break;
                case 4:
                    r = "Fin";
                    break;


                default:
                    r = r + "Opcion introducida, no reconocida";
            }

            System.out.println(r);



        } while (opcion != 4);

        sc.close();


    }


}