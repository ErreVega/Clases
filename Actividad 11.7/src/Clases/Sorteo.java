package Clases;

public abstract class Sorteo {

    protected  int posibilidades;

    public Sorteo(int posibilidades){
        this.posibilidades = posibilidades;
    }

    public abstract int lanzar();
}
