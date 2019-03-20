package Clases;

public abstract class Forma {
    protected String color;
    protected boolean relleno;

    public Forma(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }

    public Forma() {
    }
    public String identidad(){
        return this.getClass().getName();
    }

    @Override
    public abstract String toString();
}
