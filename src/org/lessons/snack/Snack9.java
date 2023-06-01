package org.lessons.snack;

public class Snack9 {
    public static void main(String[] args) {
        int n = 10;
        int somma = 0;

        for (int i = 0; i < n; i++) {
            somma += i;
        }

        double media = (double) somma / n;

        System.out.println("La somma dei primi " + n + " numeri è: " + somma);
        System.out.println("La media dei primi " + n + " numeri è: " + media);
    }
}
