package Clases;

public class Punto {
    private int coorX,
                coorY;

    public Punto(int coorX, int coorY) {
        this.coorX = coorX;
        this.coorY = coorY;
    }

    public double distanciaOrigen(){

    return Math.sqrt((this.coorX * this.coorX)+ (this.coorY * this.coorY));
    }

    public double distancia(Punto otro){
        return this.resta(otro).distanciaOrigen();
    }

    public Punto resta(Punto otro){

        int     coor1 = this.coorX - otro.getCoorX(),
                coor2 = this.coorY - otro.getCoorY();

       Punto res = new Punto(coor1, coor2);
       return res;
    }

    @Override
    public String toString() {
        return "Punto {" +
                "coorX=" + coorX +
                ", coorY=" + coorY +
                '}';
    }

    public int getCoorX() {
        return coorX;
    }

    public void setCoorX(int coorX) {
        this.coorX = coorX;
    }

    public int getCoorY() {
        return coorY;
    }

    public void setCoorY(int coorY) {
        this.coorY = coorY;
    }
}
