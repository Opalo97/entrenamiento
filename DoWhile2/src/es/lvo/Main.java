package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("NÚMERO " + ( i + 1) + " :");
            System.out.println("===============================");
            do {
                System.out.print("Dame un número positivo: ");
                numero = entrada.nextInt();
            } while (numero < 0);
            System.out.println("Número dado: " + numero);
            System.out.println();
        }

        entrada.close();
    }
}
