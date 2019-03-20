package Main;

public class Main9_4 {


    public static void main(String[] args) {
        System.out.println(devuelveNumero(1));

    }

    public static int devuelveNumero(int num) {
        try {
            if (num % 2 == 0) {
                throw new Exception("Lanzando excepcion");
            }
            if (num == 5)
                return 3;
            else
                return 1;
        } catch (Exception ex) {
            return 2;
        } finally {
            return 3;
        }
    }

}
