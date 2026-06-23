package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir un nombre :");
        int nombre = sc.nextInt();

        int somme = 0;
        for (int i = 1; i <= nombre; i++) {
            somme += i;
        }
        System.out.println(somme);
    }
}
