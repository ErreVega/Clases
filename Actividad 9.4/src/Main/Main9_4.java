package Main;

public class Main9_4 {


    public static void main(String[] args) {
        System.out.println(devuelveNumero(1));
        System.out.println(devuelveNumero(2));
        System.out.println(devuelveNumero(4));
    }

    public static int devuelveNumero(int num) {
        try {
            if (num % 2 == 0) {
                throw new Exception("Lanzando excepcion");
            }
            return 1;
        } catch (Exception ex) {
            return 2;
        } finally {
            return 3;
        }
    }

}
