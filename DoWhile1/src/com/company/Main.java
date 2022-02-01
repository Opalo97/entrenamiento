package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Dame un número: ");
            n = entrada.nextInt();
        } while ( n >= 0);
    }
}
