public class MainArray {


    public static void main(String[] args) {

        int[] array = {6, 12, 5, 9, 3, 10, 1, 8, 2, 4, 7, 11};

        int[] aux;

        aux = array;
        int valorMin, indiceMin;

        for (int iActual = 0; iActual < aux.length; iActual++) {
            valorMin = aux[iActual];
            indiceMin = iActual;
            for (int i = iActual; i < aux.length; i++) {
                if (valorMin > aux[i]) {
                    valorMin = aux[i];
                    indiceMin = i;
                }
            }

            aux[indiceMin] = aux[iActual];
            aux[iActual] = valorMin;
            System.out.println(imprime(array));
        }

    }

    private static String imprime(int[] array) {

        String r = "\n";

        for (int i = 0; i < array.length; i++) {

            r = r + "\t"+ array[i];

        }

        return r;
    }
}


