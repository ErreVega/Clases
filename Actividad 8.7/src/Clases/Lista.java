package Clases;

public class Lista {

    private Nodo primero;

    public Lista() {

    }

    public void insertarFinal(int n) {

        Nodo nuevo = new Nodo(n);
        Nodo ultimo = this.buscaUltimoNodo();
        ultimo.setSig(nuevo);

    }

    private Nodo buscaUltimoNodo() {
        boolean ultimo = false;
        Nodo consultado;
        consultado = this.primero;
        while (!ultimo) {
            if (consultado.getSig() != null)
                consultado = consultado.getSig();
            else
                ultimo = true;
        }
        return consultado;
    }

    public boolean buscaNodo(int n) {
        boolean ultimo = false,
                encontrado = false;
        Nodo consultado;
        consultado = this.primero;
        while (!ultimo && !encontrado) {
            if (consultado.getNum() == n)
                encontrado = true;
            else if (consultado.getSig() != null)
                consultado = consultado.getSig();
            else
                ultimo = true;
        }
        return encontrado;

    }

    public void insertaPrincipio(int n) {

        Nodo nuevo = new Nodo(n);
        nuevo.setSig(this.primero);
        this.primero = nuevo;


    }

    public boolean borrarNodo(int n) {
        boolean borrado = false;                    //Booleano que se devolverá.
        if (this.buscaNodo(n)) {                    //Si el nodo que se busca se encuentra en la lista
            if (this.primero.getNum() == n)             //si el nodo buscado es el primero
                this.primero = this.primero.getSig();   //se asigna al primer nodo, la posicion del 2do
            else {
                Nodo anteriorABuscado = this.primero;            // Si no es el primero se crea un nodo de busqueda que ira iterando entre los disponibles.
                while (!borrado) {                            //Mientras no se haya borrado
                    if (anteriorABuscado.getSig().getNum() == n) {         //si el Nodo donde se busca contiene el valor que buscamos
                        anteriorABuscado.setSig(anteriorABuscado.getSig().getSig()); //al Nodo anterior se le modifica su puntero y ahora apuntara al siguiente del nodo buscado
                        borrado = true;
                    } else
                        anteriorABuscado = anteriorABuscado.getSig(); //si no esta en ese nodo, se itera al siguiente
                }
            }
        }

        return borrado;
    }

    public String toString() {
        String r = "";
        boolean ultimo = false;
        Nodo actual;
        actual = this.primero;
        while (!ultimo) {
            r = r + actual.getNum() + ", ";
            if (actual.getSig() != null)
                actual = actual.getSig();
            else
                ultimo = true;
        }
        return r;


    }

}
