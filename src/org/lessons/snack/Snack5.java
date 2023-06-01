package org.lessons.snack;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;


        do {
            System.out.println("Inserisci una stringa: ");
            string = scanner.nextLine();
            if (!string.equals("0")) {

                int letters = 0;
                int numbers = 0;
                int symbols = 0;

                for (char c : string.toCharArray()) {
                    if (Character.isLetter(c)) {
                        letters++;
                    } else if (Character.isDigit(c)) {
                        numbers++;
                    } else {
                        symbols++;
                    }
                }

                System.out.println("Quantità di caratteri alfabetici: " + letters);
                System.out.println("Quantità di numeri: " + numbers);
                System.out.println("Quantità di simboli non alfanumerici: " + symbols);
            }
        }
        while (!string.equals("0"));
    }
}
