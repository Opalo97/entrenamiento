package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int factorial = 1, numero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame un numero: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("Factorial = " + factorial);
    }
}
