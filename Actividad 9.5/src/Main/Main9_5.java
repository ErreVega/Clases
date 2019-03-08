package Main;
import Clases.*;
public class Main9_5 {
    public static void main(String[] args) {
        int i = 550;
        int i2 = -3;
        int i3 = 60;
        try{
            ErrorClase.limite(i3);
            ErrorClase.limite(i2);
            ErrorClase.limite(i);






        }catch (ErrorClase e){
            System.out.println(e.getMessage());
        }
    }
}
