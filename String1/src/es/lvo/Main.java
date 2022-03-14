package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escribe un texto: ");
    String texto = entrada.nextLine();
    System.out.print("Intenta adivinar la letra del texto: ");
    char letra = entrada.nextLine().charAt(0);

    for (int i = 0; i < texto.length(); i++) {
        if (letra == texto.toLowerCase().charAt(i) || letra == texto.toUpperCase().charAt(i)) {
            System.out.print(texto.charAt(i) + " ");
        } else if (texto.charAt(i) == ' ') {
            System.out.print("  ");
        } else {
            System.out.print("_ ");
        }
    }

    entrada.close();
  }
}
