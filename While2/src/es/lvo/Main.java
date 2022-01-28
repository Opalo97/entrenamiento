package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame un número positivo: ");
        n = entrada.nextInt();

        while (n < 0) {
            System.out.println("ERROR: el número " + n + " no es positivo ");
            System.out.print("Dame un número positivo: ");
            n = entrada.nextInt();

        }
        System.out.print("El número " + n + " es positivo ");


    }
}
