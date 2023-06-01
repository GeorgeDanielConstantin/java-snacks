package org.lessons.snack;

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero: ");
        String stringNumber = scanner.nextLine();

        int intNumber = 0;

        for (int i = 0; i < stringNumber.length(); i++) {
            char posString = stringNumber.charAt(i);

            int posInt = 0;

            switch (posString) {
                case '1' -> posInt = 1;
                case '2' -> posInt = 2;
                case '3' -> posInt = 3;
                case '4' -> posInt = 4;
                case '5' -> posInt = 5;
                case '6' -> posInt = 6;
                case '7' -> posInt = 7;
                case '8' -> posInt = 8;
                case '9' -> posInt = 9;
            }

            intNumber = intNumber * 10 + posInt;

        }

        System.out.println("Numero intero: " + intNumber);
    }
}
