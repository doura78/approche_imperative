package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {
        // Création d'un scanner pour lire la saisie de l'utilisateur
        Scanner sc = new Scanner(System.in);

        // Demande du rang N à l'utilisateur
        System.out.println("Veuillez saisir un rang N : ");
        int n = sc.nextInt();

        // Variable qui contiendra le résultat final
        int resultat;

        // Cas où le rang demandé est 0
        if (n == 0) {
            resultat = 0;
        }
        // Cas où le rang demandé est 1
        else if (n == 1) {
            resultat = 1;
        }
        // Cas général : calcul des autres termes de la suite
        else {
            int precedent = 0; // terme précédent
            int courant = 1;   // terme courant

            // Boucle pour calculer la suite jusqu'au rang demandé
            for (int i = 1; i <= n; i++) {
                int suivant = precedent + courant; // somme des deux termes précédents
                precedent = courant;               // on décale les valeurs
                courant = suivant;
            }

            // On récupère le terme calculé
            resultat = courant;
        }

        // Affichage du résultat
        System.out.println("Le nombre de rang " + n + " est " + resultat);
    }
}