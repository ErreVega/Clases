package Clases;

public class Encargado extends Empleado {

    public Encargado(){
        super();
    }

    public Encargado(double sueldo, String nombreEmpleado) {
        super(sueldo, nombreEmpleado);
    }

    @Override
    public double getSueldo() {
        return super.getSueldo() * 1.1;
    }
}
