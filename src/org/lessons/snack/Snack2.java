package org.lessons.snack;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        String[] names = {"Mario", "Giuseppe", "Franco", "Pino", "Nico", "Giacomo", "Jack", "Al", "John"};
        String[] surnames = {"Patagaserru", "Finigghiu", "Galapagos", "Parrego", "Nagasella", "Parasanna", "Gusunilla", "Cassacarragnu", "Parrignalala"};

        Random random = new Random();

        for (int i = 0; i < names.length; i++) {
            int iName = random.nextInt(names.length);
            int iSurname = random.nextInt(surnames.length);

            String name = names[iName];
            String surname = surnames[iSurname];

            System.out.println(name + " " + surname);
        }
    }
}
