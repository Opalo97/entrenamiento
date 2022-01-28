package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame un número (0 para termimnar): ");
        n = entrada.nextInt();

        while (n > 0) {
            if (n % 2 == 0) {
                System.out.println("El número " + n + " es PAR ");
            } else {
                System.out.print("El número " + n + " es IMPAR ");
            }
            System.out.print("Dame un número (0 para termimnar): ");
            n = entrada.nextInt();
        }


    }
}
