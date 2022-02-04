package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero, divisores = 0;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Dame un número: ");
            numero = entrada.nextInt();

        } while (numero > 100 || numero <= 0);

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }

        if (divisores == 2) {
            System.out.println("El número " + numero + " es primo");
        } else {
            System.out.println("El número " + numero + " es compuesto");
        }

    }
}
