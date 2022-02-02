package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 0, suma = 0;
        Scanner entrada = new Scanner(System.in);

        do {
            suma = suma + n;
            System.out.print("Dame un número: ");
            n = entrada.nextInt();
        } while (n >= 0);
        System.out.print(suma);
    }
}
