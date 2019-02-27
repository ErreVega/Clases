package Clases;

public class Nodo {

    private int num ;
    private Nodo sig;


    public Nodo(int n){
        this.num = n;
    }
    public int getNum() {
        return  this.num;
    }
    public Nodo getSig(){
        return this.sig;
    }
    public void setNum(int n) {
        this.num = n;
    }
    public void setSig(Nodo nodo){
        this.sig = nodo;
    }


}
