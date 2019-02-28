package Clases;

public class Producto {

    private int numProducto;
    private String descripccion;
    private float precio;




    public Producto(){
        this.numProducto = 0;
        this.descripccion ="";
        this.precio = 0;
    }
    public Producto(int numProducto){
        this.numProducto = numProducto;
        this.descripccion ="";
        this.precio = 0;
    }
    public Producto(int numProducto, float precio){
        this.numProducto = numProducto;
        this.descripccion ="";
        this.precio = precio;
    }
    public Producto(String descripccion, float precio){
        this.descripccion = descripccion;
        this.precio = precio;
    }
    public Producto(int numProducto, String descripccion, float precio){
        this.numProducto = numProducto;
        this.descripccion = descripccion;
        this.precio = precio;
    }

    public void setNumProducto(int numProducto) {
        this.numProducto = numProducto;
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

    public String toString(){
        String r = "Producto nº " +this.numProducto + "......" + precio + "\n";
        return  r;
    }
}
