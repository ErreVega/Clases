public class ArrayOrd extends ArrayDesordenado {

    /**
     * Clase que hereda los metodos del array desordenado pero incluye  el metodo de ordenacion necesario
     */

    public ArrayOrd() {

        /**
         * Constructor por defecto, que llama al de la clase padre
         */
        super();
    }

    public void insertar(int valor){
        /**
         * Metodo insertar que sobrecarga al de la clase padre.
         *
         * Dentro de él, se llama al metodo de la clase principal
         * y despues al de ordenacion para que siempre se mantenga ordenado.
         */
        super.insertar(valor);
        this.ordena();
    }


    public void ordena() {
        /**
         * Metodo de ordenacion.
         *
         * Recorre el array valor por valor, comparando el valor actual con todos los demas.
         * Iguala el valor minimo del array al actual, despues, localiza el valor minimo almacenado en el array  si lo hay
         * e intercambia las posiciones entre estos valores.
         * Una vez realizado, avanza a la siguiente posicion. Como ya sabe que el valor anterior esta ordenado, reseta el valor
         * minimo al valor actual de nuevo y repite el proceso para todas las posiciones del array.
         */
        int[] aux;

        aux = this.getArray();
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

        }
        this.setArray(aux);

    }


}
