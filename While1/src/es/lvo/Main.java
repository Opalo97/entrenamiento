package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, suma = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame un número: ");
        n = entrada.nextInt();

        while (n >= 0) {
            suma += n;
            System.out.print("Dame un número: ");
            n = entrada.nextInt();
        }
        System.out.println("La suma de todos los números es :" + suma);
    }
}
