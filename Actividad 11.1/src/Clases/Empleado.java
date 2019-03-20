package Clases;

public class Empleado {
    protected double sueldo;
    protected String nombreEmpleado;

    public Empleado(){
        this.nombreEmpleado = "John Doe";
        this.sueldo = 0;
    }

    public Empleado(double sueldo, String nombreEmpleado){
        this.nombreEmpleado = nombreEmpleado;
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
}
