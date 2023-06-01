package org.lessons.snack;

import java.util.Scanner;

public class Snack8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validNumber = false;
        int number;
        do {
            System.out.println("Inserisci un numero di 4 cifre: ");
            number = scanner.nextInt();

            if (number > 999 && number < 10000) {
                // valid number
                validNumber = true;
            }
        } while (!validNumber);

        scanner.close();

        int cifra1 = number / 1000;
        int cifra2 = (number / 100) % 10;
        int cifra3 = (number / 10) % 10;
        int cifra4 = number % 10;

        int somma = cifra1 + cifra2 + cifra3 + cifra4;

        System.out.println("La somma delle cifre è: " + somma);
    }
}
