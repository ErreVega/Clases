package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main9_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int     numeroAdivinar = (int) (Math.random() * 500),
                numUser = 0,
                contIntententos = 0;
        do {


            try {
                System.out.print("\nIntroduce numero a adivinar entre 1 y 500: ");

                contIntententos++;
                numUser = sc.nextInt();
                if (numUser > numeroAdivinar)
                    System.out.println("\nNumero introducido mayor.\nIntentos: " + contIntententos);
                else if (numUser < numeroAdivinar)
                    System.out.println("\nNumero introducido menor.\nIntentos: " + contIntententos);
                else                 System.out.println("\nNumero adivinado\nIntentos: " + contIntententos);

                System.out.println(numeroAdivinar);


            } catch (Exception excp) {
                System.out.println("\nValor no valido.");
            }


        } while (numUser != numeroAdivinar);








    }
}
