package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        int numero, cuenta = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cargando numeros...");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 10) + 1;
        }

        System.out.print("Escribe un numero: ");
        numero = entrada.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero){
                cuenta += i;
            }
        }
        System.out.println("El numero " + numero + " aparece " + cuenta + " veces.");

        for (int i = 0; i < numeros.length; i++){
            if (i < numeros.length - 2) {
                System.out.print(numeros[i] + ", ");
            } else if (i < numeros.length - 1){
                System.out.print(numeros[i] + " y ");
            } else {
                System.out.print(numeros[i]);
            }
        }
    }
}
