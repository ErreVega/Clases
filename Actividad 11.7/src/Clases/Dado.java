package Clases;

public class Dado extends Sorteo {

    public Dado(){
        super(6);
    }

    @Override
    public int lanzar() {

        return (int) ((Math.random() * this.posibilidades)) + 1;
    }
}
