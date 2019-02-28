package Clases;

public class Nodo {

    private Producto producto ;
    private Nodo sig;


    public Nodo(Producto producto){
        this.producto = producto;
    }
    public Producto getProducto() {
        return  this.producto;
    }
    public Nodo getSig(){
        return this.sig;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public void setSig(Nodo nodo){
        this.sig = nodo;
    }


}
