package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe un número: ");
        numero = entrada.nextInt();

        for (int numero = 0; numero > 1; numero++){
            System.out.println(numero);
        }
    }
}
