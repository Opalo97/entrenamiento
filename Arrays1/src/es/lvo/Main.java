package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int[] numeros = new int[10];
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame 10 numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Númeroo " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < numeros.length; i++){
            if (i < (numeros.length - 1)) {
                System.out.print(numeros[i] + ", ");
            } else if (i < (numeros.length)){
                System.out.print(numeros[i] + " y ");
            } else {
                System.out.print("y " + numeros[i]);
            }


        }
    }
}
