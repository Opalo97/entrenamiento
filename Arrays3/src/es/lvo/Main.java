package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        boolean sonIguales = true;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame 5 numeros: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array1[i] = entrada.nextInt();
        }

        System.out.println("Dame otros 5 numeros: ");
        for (int i = 0; i < array2.length; i++){
            System.out.print("Número " + (i + 1) + ": ");
            array2[i] = entrada.nextInt();
        }

        for (int i = 0; i < array1.length && sonIguales; i++){
           sonIguales = array1[i] == array2[i];
        }

        if (sonIguales){
            System.out.print("Los numeros son iguales ");
        } else {
            System.out.print("Los numeros no son iguales ");
        }
    }
}
