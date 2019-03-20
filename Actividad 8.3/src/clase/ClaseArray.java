package clase;

import java.util.Arrays;

public class ClaseArray {

    private int[] array;
    private static int nulo = -9;


    public static void main(String[] args) {

        ClaseArray a1, a2, a3;
        int[] array = {1,2,10,25,30,5,13,12};
        a1 = new ClaseArray();
        a2 = new ClaseArray(array);
        a3 = new ClaseArray();

        a1.ordenaBurbuja();
        System.out.println(a1);

        a2.ordenarInsercionDirecta();
        System.out.println(a2);

        a3.ordenarSeleccionDirecta();
        System.out.println(a3);

        System.out.println(a1.fusionaArray(a2));
        }

    public ClaseArray() {

        array = new int[]{6, 12, 5, 9, 3, 10, 1, 8, 2, 4, 7, 11};
    }

    public ClaseArray(int[] array) {
        this.array = array;
    }

    public ClaseArray (int tam) {
        this.array = new int[tam];
    }

    public void ordenaSeleccionDirecta2(){

        int     valMin = this.array[0],
                indiceMin = 0,
                aux;



        for ( int i = 0 ; i < this.array.length; i ++){
            for ( int j = i ; j < this.array.length; j ++){
                if (this.array[j] < valMin){
                    aux = this.array[i];
                    this.array[i] = this.array[j];
                    this.array[j] = aux;
                }



            }


        }


    }





    public void ordenarSeleccionDirecta() {

        int[] aux;
        int cComp = 0, cAsig = 0;

        aux = this.array;
        int valorMin, indiceMin;

        for (int iActual = 0; iActual < aux.length; iActual++) {
            valorMin = aux[iActual];
            indiceMin = iActual;
            cAsig = cAsig + 2;
            for (int i = iActual; i < aux.length; i++) {
                cComp++;
                if (valorMin > aux[i]) {
                    valorMin = aux[i];
                    indiceMin = i;
                    cAsig = cAsig + 2;
                }
            }

            aux[indiceMin] = aux[iActual];
            aux[iActual] = valorMin;
            cAsig = cAsig + 2;

        }
        this.array = aux;
        System.out.println("\nNumero de comparaciones: " + cComp + "\nNumero de asignaciones: " + cAsig);

    }

    public void ordenaBurbuja() {
        boolean ordenado;
        int cComp = 0, cAsig = 0;
        do {
            ordenado = true;
            for (int i = 0; i < this.array.length - 1; i++) {
                cComp++;
                if (this.array[i] > this.array[i + 1]) {
                    int aux = this.array[i];
                    this.array[i] = this.array[i + 1];
                    this.array[i + 1] = aux;
                    cAsig = cAsig + 3;
                    ordenado = false;
                }

            }
        } while (!ordenado);

        System.out.println("\nNumero de comparaciones: " + cComp + "\nNumero de asignaciones: " + cAsig);


    }
    public void ordenarInsercionDirecta() {
        int cComp = 0, cAsig = 0;
        int aux;
        for (int i = 1; i < this.array.length; i++) {
            aux = array[i];
            cAsig++;
            int j = i - 1;
            while ((j >= 0) && (aux < this.array[j])) {
                cComp = cComp + 2;
                array[j + 1] = array[j];
                cAsig++;
                j--;
            }
            array[j + 1] = aux;
            cAsig++;
        }

        System.out.println("\nNumero de comparaciones: " + cComp + "\nNumero de asignaciones: " + cAsig);

    }
// añadir comentario aleatorio para que me deje subirlo a git

    public boolean busquedaLineal(int valor) {
        boolean r = false;
        int cComp = 0;
        for (int i = 0; i < this.array.length && !r; i++) {
            cComp++;
            if (valor == this.array[i])
                r = true;
        }
        System.out.println("\nNumero de comparaciones: " + cComp +
                "\nResultado: " + r);
        return r;
    }

    public boolean busquedaDicotomica(int valor) {

        boolean r = false, fin = false;
        int cComp = 0, puntoMedio, puntoInicio = 0, puntoFin = this.array.length;

        do {

            puntoMedio = (((int) (puntoFin - puntoInicio) / 2) + puntoInicio);
            cComp++;
            if (valor > this.array[puntoFin - 1] || valor < this.array[puntoInicio])
                fin =true;
            else {
                if (valor == this.array[puntoMedio]) {
                    r = true;
                    fin = true;
                } else {
                    cComp++;
                    if (valor > this.array[puntoMedio]) {
                        puntoInicio = puntoMedio;
                    } else {
                        puntoFin = puntoMedio;
                    }
                }
            }
        } while (!fin);

        System.out.println("\nNumero de comparaciones: " + cComp +
                "\nResultado: " + r);

        return r;
    }


    public ClaseArray fusionaArray(ClaseArray otro){
        int tam = this.array.length + otro.array.length;

        ClaseArray nuevo = new ClaseArray(tam);

        for (int i = 0; i < tam; i++){
            if (i < this.array.length)
                nuevo.array[i] = this.array[i];
            else
                nuevo.array[i] = otro.array[i - this.array.length];
        }

        nuevo.ordenaBurbuja();
        return nuevo;

    }


    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public String toString() {
        return "clase.ClaseArray{"
                + Arrays.toString(array) +
                '}';
    }

}
