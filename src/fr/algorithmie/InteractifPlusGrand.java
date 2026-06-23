package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir le nombre 1 :");
        int plusGrand = sc.nextInt();

        for (int i = 2; i <= 10; i++) {
            System.out.println("Veuillez saisir le nombre " + i + " : ");
            int nb = sc.nextInt();

            if (nb > plusGrand) {
                plusGrand = nb;
            }
        }
        System.out.println("Le plus grand nombre est: " + plusGrand);
    }
}
