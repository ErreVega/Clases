package Main;

public class Main9_2 {

    public static void main(String[] args) {


        try {
            System.out.println("Mensaje normal");

            Exception e1 = new Exception("Mensaje de error.");
            throw e1;
        }
        catch (Exception e1) {
            System.out.println(e1.getMessage());
        }


    }



}
