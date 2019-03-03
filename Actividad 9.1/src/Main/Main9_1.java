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
                System.out.print("\nIntroduce numero a adivinar entre 0 y 500: ");
                contIntententos++;
                numUser = sc.nextInt();
                while (numUser < 0 || 500 < numUser){
                    System.out.println("\nNumero introducido fuera de rango.");
                    contIntententos++;
                    numUser = sc.nextInt();
                }
                if (numUser > numeroAdivinar)
                    System.out.println("\nNumero introducido mayor.\nIntentos: " + contIntententos);
                else if (numUser < numeroAdivinar)
                    System.out.println("\nNumero introducido menor.\nIntentos: " + contIntententos);
                else System.out.println("\nNumero adivinado\nIntentos: " + contIntententos);
            } catch (InputMismatchException e) {
                System.out.println("\nValor no valido.");
                sc.nextLine();
            }
        } while (numUser != numeroAdivinar);
    }
}
