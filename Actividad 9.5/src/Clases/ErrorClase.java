package Clases;

public class ErrorClase extends Exception{

    public ErrorClase(String msj){
        super(msj);
    }

    public static void limite(int a) throws ErrorClase{
        if ( a < 0)
            throw new ErrorClase("Numero menor");
        else if ( a > 500)
            throw  new ErrorClase("Numero Mayor");

    }






}
