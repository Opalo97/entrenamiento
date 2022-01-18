package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int suma = 0, numero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame un numero: ");
        numero = entrada.nextInt();

        for (int i = 0; i < numero; i++){
            suma += i + 1;
        }
        System.out.println("Suma = " + suma);

    }
}
