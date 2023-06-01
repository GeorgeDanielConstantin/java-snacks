package org.lessons.snack;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una parola: ");
        String word = scanner.nextLine();

        boolean check = false;


        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(word.length() - 1 - i)) {
                check = true;
                break;
            }
        }

        if (check) {
            System.out.println("La parola è palindroma.");
        } else {
            System.out.println("La parola non è palindroma.");
        }
    }
}
