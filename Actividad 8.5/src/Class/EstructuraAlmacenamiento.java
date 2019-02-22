package Class;

/**
 * Clase padre que engloba los metodos de gestion  y control de las Pilas y las Colas.
 *
 * @author Rubén López
 * @since 22/02/2019
 *
 */
public class EstructuraAlmacenamiento {
    /**
     * Atributos:
     * <p>
     * Array de enteros.
     * <p>
     * Tamaño del array y valor del "nulo" como astributos estaticos.
     */

    protected int[] array;
    protected static final int tam = 5,
            nulo = -100;

    /**
     * Se genera un nuevo objeto asignando al array, un array nuevo inicializado a "nulos"
     */
    public EstructuraAlmacenamiento() {

        this.array = EstructuraAlmacenamiento.nuevoArray();

    }

    /**
     * Se genera un nuevo array con el tamaño, llamando a un atributo estatico
     *
     * @return int []  el nuevo array inicializado a "nulos"
     */
    public static int[] nuevoArray() {

        int[] nuevo = new int[tam];
        for (int i = 0; i < tam; i++) {
            nuevo[i] = nulo;
        }
        return nuevo;

    }

    public String push(int valor) {
        return "";
    }


    /**
     * Devuelve el primer valor almacenado en la estructura, eliminandolo de la misma y reorganizandola,
     * para que el resto de valores avancen dicha posicion.
     *
     * @return int  El primer valor de la estructura.
     */
    public int pop() {

        int r = this.array[0];

        for (int i = 0; i < this.array.length - 1; i++) {
            this.array[i] = this.array[i + 1];
        }

        this.array[this.array.length - 1] = nulo;
        return r;

    }

    /**
     * Elimina todos los valores de la estructura, sustituyendo el array por uno nuevo con valores "nulos"
     */
    public void delete() {

        this.array = EstructuraAlmacenamiento.nuevoArray();
    }

    /**
     * Comprueba si la estructura ha llegado a su maxima capacidad de almacenamiento, devolviendo
     * verdadero o falso.
     *
     * @return boolean  devuelve si la estructura esta llena o no.
     */
    public boolean llena() {

        boolean r = true;
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == nulo)
                r = false;
        }
        return r;
    }

    /**
     * Comprueba si hay algun valor introducido en la estructura, devolviendo un booleano como respuesta.
     *
     * @return boolean devuelve si la estructura esta vacia o no.
     */
    public boolean vacia() {

        boolean r = true;
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != nulo)
                r = false;
        }
        return r;
    }

    /**
     * Sobrecarga el metodo toString para imprimir los valores almacenados.
     *
     * @return String cadena ordenada con los valores almacenados.
     */
    public String toString() {

        String r = "\n";
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != nulo)
                r = r + this.array[i] + "\n";
        }
        return r;
    }


}

