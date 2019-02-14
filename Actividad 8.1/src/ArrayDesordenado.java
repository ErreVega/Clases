
public class ArrayDesordenado {

    private int[] array;
    private final int NULO = -9;



    public ArrayDesordenado() {
        /**
         * Constructor con tamaño del array por defecto, con tamaño 4. Asigna todos los valores a
         * "NULO" = -9;
         *
         */
        int tamañoDefault = 4;
        this.array = new int[tamañoDefault];
        for (int i = 0; i < tamañoDefault; i++) {
            this.array[i] = NULO;
        }
    }

    public ArrayDesordenado(int tam) {
        /**
         * Constructor con tamaño del array como parametro. Asigna todos los valores a
         * "NULO" = -9;
         *
         * @param entero tamaño del array
         */
        this.array = new int[tam];
        for (int i = 0; i < tam; i++) {
            this.array[i] = NULO;
        }
    }

    public void insertar(int valor) {
        /**
         * Metodo que introduce nuevo valor en el primer valor NULO del array. En el
         * caso de que el valor no pueda ser insertado porque el array esta lleno (no
         * hay NULOS), se amplia el array en 4 elementos mas guardando los valores ya
         * asignados y se llama a sí mismo de nuevo.
         */
        if (this.isLleno())
            this.ampliaArray();

        boolean insertado = false;
        for (int i = 0; i < this.array.length && !insertado; i++) {
            if (array[i] == NULO) {
                array[i] = valor;
                insertado = true;
            }
        }

    }

    public boolean isLleno(){
        boolean lleno = true;
        for (int i = 0; i < array.length ; i++){
            if (array[i] == NULO)
                lleno = false;
        }
        return lleno;
    }

    public void ampliaArray(){
        int[] arrayCopia = new int[array.length];

        arrayCopia = this.array;

        this.array = new int[arrayCopia.length + (int)(arrayCopia.length/4)];

        for (int i = 0; i < arrayCopia.length; i++) {
            this.array[i] = arrayCopia[i];
        }
        for (int i = arrayCopia.length; i < this.array.length; i++) {
            this.array[i] = NULO;
        }

    }


    public boolean borrarValor(int valor) {
        /**
         * Metodo que busca el valor que se quiere borrar. Una vez identificado,
         * sobreescribe en su indice de posicion, las posiciones posteriores, eliminando
         * el elemento y reordenando el array Devuelve el resultado del metodo. siendo
         * falso, si no ha encontrado el valor a robar
         *
         * @param entero valor que se buscara en el array para borrar
         * @return booleano resultado del borrado
         */
        boolean borrado = false;
        for (int i = 0; i < this.array.length && !borrado; i++) {
            if (array[i] == valor) {
                for (int j = i; j < this.array.length - 1; j++) {
                    this.array[j] = this.array[j + 1];
                }
                this.array[this.array.length - 1] = NULO;
                borrado = true;
            }
        }
        return borrado;
    }

    public int borrarTodosValor(int valor) {
        /**
         * Aprovechando el metodo anterior, se le llamara repetidamente hasta que el
         * valor introducido se haya eliminado por completo. Para controlar la salida,
         * cada vez que se itere el metodo se sumara un contador que reflejara cuantas
         * veces se ha eliminado el valor dentro del array
         *
         * @param entero valor que se buscara para borrar
         * @return el numero de elementos borrados que contenian ese valor
         */
        int contBorrados = 0;
        while (this.borrarValor(valor)) {
            contBorrados++;
        }
        return contBorrados;
    }
    public String imprimeConNulos() {
        String r = "\n";
        for (int i = 0; i < this.array.length; i++) {
            r = r + this.array[i] + "\n";
        }
        return r;
    }


    public String toString() {
        String r = "\n";
        for (int i = 0; i < this.array.length; i++) {
            if(this.array[i] != NULO)
                r = r + this.array[i] + "\n";
        }
        return r;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

}