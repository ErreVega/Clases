
package Class;
/**
 *
 * Estructura Pila que hereda todos los metodos de construccion y gestion de la estructura de cola, excepto aquel que introduce
 * datos en la estructura, ya que en este caso, los valores se introduciran en la primera posicion desplazando a los que ya hubiera.
 *
 * @author Rubén Vega
 * @since 22/02/2019
 *
 */

public class Pila  extends EstructuraAlmacenamiento {
    /**
     * Constructor de la pila, con un nuevo array inicializado a "nulos"
     */
    public Pila(){

        this.array = Pila.nuevoArray();
    }
    /**
     * Metodo que inserta valores en la estructura en la primera posicion, reorganizando
     * los posibles valores que ya hubiera en ella.
     *
     * @param valor Valor introducido por el usuario.
     * @return String Con el resultado de la operacion.
     */
    public String push(int valor){

        String r = "";
        boolean insertado = false;
        if (this.llena())
            r = "Pila llena." ;
        else {
            if (this.vacia())
                this.array[0] = valor;
            else {
                int aux;
                for (int i = this.array.length - 1; i > 0; i--)
                    this.array[i] = this.array[i - 1];

                this.array[0] = valor;
            }
            r = "Valor "+ valor+ " insertado en la pila.";
        }
        return r;
    }


}
