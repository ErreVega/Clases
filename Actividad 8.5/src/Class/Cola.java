
package Class;

/**
 * Estructura de Cola, en la cual se pueden introducir elementos, los cuales se
 * iran colocando unos despues de otros por orden de llegada.
 * <p>
 * Cuando se solicite un elemento siempre saldrá el primer elemento y el resto avanzaran una posicion.
 *
 * @author Rubén Vega
 * @since 22/02/2019
 */
public class Cola extends EstructuraAlmacenamiento {


    /**
     * Inserta un valor en la estructura devolviendo como string el resultado de la operacion
     * <p>
     * Si esta esta llena, no insertara el valor.
     * <p>
     * Si esta vacia se insertara en la primera posicion.
     * <p>
     * Si no se cumplen ninguna de estas condiciones se insertara en el primer valor no "nulo" disponible del array.
     *
     * @param valor valor que se quiere introducir en la estructura.
     * @return String  Resultado de la operacion, para que se pueda recoger cuando se llame al metodo.
     */
    public String push(int valor) {

        String r = "";
        boolean insertado = false;
        if (this.llena())
            r = "Cola llena.";
        else {
            if (this.vacia())
                this.array[0] = valor;
            else
                for (int i = 1; i < this.array.length && !insertado; i++)
                    if (this.array[i] == nulo) {
                        this.array[i] = valor;
                        insertado = true;
                    }

            r = "Valor " + valor + " insertado en la cola.";
        }
        return r;


    }






}
