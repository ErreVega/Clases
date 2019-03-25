package Clases;

public class Moneda  extends Sorteo{

    public Moneda(){
        super(2);
    }


    @Override
    public int lanzar() {
        String resultado = "Cara";
        int r = -1;
        if ((int) (Math.random()* this.posibilidades) >= 1) {
            resultado = "Cruz";
            r = 1;
        }
        System.out.println(resultado);
        return r;
    }
}
