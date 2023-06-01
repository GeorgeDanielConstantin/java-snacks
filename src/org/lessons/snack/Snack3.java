package org.lessons.snack;

import java.util.Random;

public class Snack3 {
    public static void main(String[] args) {
        Random randomArray = new Random();

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomArray.nextInt(0, 100);
        }

        for (int s : numbers) {
            System.out.println(s);
        }

        int somma = 0;

        for (int i = 0; i < numbers.length; i += 2) {
            somma += numbers[i];
        }

        System.out.println("La somma degli elementi in posizione dispari è: " + somma);
    }
}
