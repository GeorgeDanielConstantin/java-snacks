package org.lessons.snack;

import java.util.Scanner;

public class Snack7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero intero: ");
        int totalSeconds = Integer.parseInt(scanner.nextLine());

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = (totalSeconds % 3600) % 60;


        System.out.println(hours + "h:" + minutes + "m:" + seconds + "s");
    }
}
