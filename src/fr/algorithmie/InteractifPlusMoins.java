package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int plusMoins = (int) (Math.random() * 100) + 1;
        int proposition = 0;
        int coups = 0;

        while (proposition != plusMoins) {
            System.out.println("Saisissez un nombre entre 1 et 100: ");
            proposition = sc.nextInt();
            coups++;

            if (proposition < plusMoins) {
                System.out.println("C'est plus !");
            } else if (proposition > plusMoins) {
                System.out.println("Cest moins");
            }
        }

        System.out.println("Bravo vous avez trouvé en " + coups + " coups");
    }
}
