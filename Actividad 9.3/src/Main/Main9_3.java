package Main;

public class Main9_3 {

    public static void main(String[] args) {

        int i = (int) (Math.random() * 999);

        try{
            if (i % 2 == 0)
                throw new Exception("Numero par.");
            else
                throw new Exception("Numero impar.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println( i );
        }


    }
}
