package org.lessons.snack;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number);
        } else {
            System.out.println(number + 1);
        }
    }
}