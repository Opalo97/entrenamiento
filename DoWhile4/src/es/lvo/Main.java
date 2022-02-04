package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

      for (int i = 0; i < 5; i++) {
          System.out.println("NÚMERO " + (i + 1) + " :");
          System.out.println("=========================================================");
          do {
              System.out.print("Dame un número entre 1 y 100: ");
              numero = entrada.nextInt();
          } while (numero > 100 || numero < 1);
      }
    }
}
