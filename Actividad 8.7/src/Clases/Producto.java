package Clases;

public class Producto {

    private int numProducto;
    private String descripccion;
    private float precio;

    private static int numProductorNuevo;


    public Producto(){
        this.numProducto = numProductorNuevo++;
        this.descripccion ="";
        this.precio = 0;
    }
    public Producto(String descripccion, float precio){
        this.numProducto = numProductorNuevo++;
        this.descripccion = descripccion;
        this.precio = precio;
    }

    public int getNumProducto() {
        return numProducto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }
}
