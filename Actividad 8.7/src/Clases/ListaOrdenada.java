package Clases;

public class ListaOrdenada {

    private Nodo primero;

    public ListaOrdenada() {

    }

    public boolean insertar(Producto producto) {
        boolean insertado = false;
        Nodo nInsertar = new Nodo(producto);
        if (this.primero == null) {
            this.primero = nInsertar;
            insertado = true;
        } else if (this.buscaNodo(producto) == null) {
            Nodo nActual = this.primero;
            Nodo nSiguiente;

            while (!insertado) {
                if (producto.getNumProducto() < nActual.getProducto().getNumProducto()) {
                    this.primero = nInsertar;
                    nInsertar.setSig(nActual);
                    insertado = true;
                } else if (nActual.getSig() == null) {
                    nActual.setSig(nInsertar);
                    insertado = true;

                } else if (nActual.getProducto().getNumProducto() < producto.getNumProducto()
                        && producto.getNumProducto() < nActual.getSig().getProducto().getNumProducto()) {

                    nSiguiente = nActual.getSig();
                    nActual.setSig(nInsertar);
                    nInsertar.setSig(nSiguiente);
                    insertado = true;
                }
                nActual = nActual.getSig();
            }


        }


        return insertado;
    }

    public Producto buscaNodo(int numProducto) {
        Producto p = new Producto(numProducto);
        return buscaNodo(p);
    }


    public Producto buscaNodo(Producto producto) {
        Producto p = null;

        boolean ultimo = false,
                encontrado = false;
        Nodo consultado;
        consultado = this.primero;
        while (!ultimo && !encontrado) {
            if (consultado.getProducto().getNumProducto() == producto.getNumProducto()) {
                encontrado = true;
                p = consultado.getProducto();
            } else if (consultado.getSig() != null)
                consultado = consultado.getSig();
            else
                ultimo = true;
        }
        return p;
    }


    public boolean borrarNodo(Producto producto) {
        boolean borrado = false;                    //Booleano que se devolverá.
        if (this.buscaNodo(producto) != null)
            if (this.buscaNodo(producto).getNumProducto() == producto.getNumProducto()) {                    //Si el nodo que se busca se encuentra en la lista
                if (this.primero.getProducto().getNumProducto() == producto.getNumProducto()) {           //si el nodo buscado es el primero
                    this.primero = this.primero.getSig();   //se asigna al primer nodo, la posicion del 2do
                    borrado = true;
                } else {
                    Nodo anteriorABuscado = this.primero;            // Si no es el primero se crea un nodo de busqueda que ira iterando entre los disponibles.
                    while (!borrado) {                            //Mientras no se haya borrado
                        if (anteriorABuscado.getSig().getProducto().getNumProducto() == producto.getNumProducto()) {         //si el Nodo donde se busca contiene el valor que buscamos
                            anteriorABuscado.setSig(anteriorABuscado.getSig().getSig()); //al Nodo anterior se le modifica su puntero y ahora apuntara al siguiente del nodo buscado
                            borrado = true;
                        } else if (anteriorABuscado.getSig() != null)
                            anteriorABuscado = anteriorABuscado.getSig(); //si no esta en ese nodo, se itera al siguiente
                    }
                }
            }

        return borrado;
    }

    public boolean borrarNodo(int numProducto) {
        Producto p1 = new Producto(numProducto);
        return borrarNodo(p1);
    }

    public String toString() {
        String r = "";
        boolean ultimo = false;
        Nodo actual;
        actual = this.primero;
        while (!ultimo) {
            r = r + actual.getProducto();
            if (actual.getSig() != null)
                actual = actual.getSig();
            else
                ultimo = true;
        }
        return r;


    }

}
