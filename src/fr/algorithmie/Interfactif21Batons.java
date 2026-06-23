package fr.algorithmie;

import java.util.Scanner;

public class Interfactif21Batons {
    public static void main(String[] args) {
        // Scanner pour lire la saisie du joueur
        Scanner scanner = new Scanner(System.in);

        // Nombre de bâtons au départ
        int nbBatons = 21;

        // Tirage aléatoire pour savoir si le joueur commence
        // true = joueur, false = ordinateur
        boolean tourJoueur = Math.random() < 0.5;

        // Message de début
        System.out.println("Début du jeu avec " + nbBatons + " bâtons.");

        // La partie continue tant qu'il reste des bâtons
        while (nbBatons > 0) {
            // Affiche le nombre de bâtons restants
            System.out.println("Il reste " + nbBatons + " bâtons.");

            // Tour du joueur
            if (tourJoueur) {
                int prise;

                // On redemande tant que la saisie n'est pas correcte
                do {
                    System.out.print("Combien de bâtons voulez-vous prendre (1 à 3) ? ");
                    prise = scanner.nextInt();
                } while (prise < 1 || prise > 3 || prise > nbBatons);

                // On retire les bâtons pris par le joueur
                nbBatons = nbBatons - prise;

                // Si le joueur prend le dernier bâton, il perd
                if (nbBatons == 0) {
                    System.out.println("Vous avez pris le dernier bâton, vous avez perdu.");
                } else {
                    // Sinon c'est au tour de l'ordinateur
                    tourJoueur = false;
                }

            } else {
                // Tour de l'ordinateur
                int priseOrdinateur = (int)(Math.random() * 3) + 1;

                // On vérifie que l'ordinateur ne prend pas plus de bâtons qu'il n'en reste
                while (priseOrdinateur > nbBatons) {
                    priseOrdinateur = (int)(Math.random() * 3) + 1;
                }

                // Affichage du choix de l'ordinateur
                System.out.println("L'ordinateur prend " + priseOrdinateur + " bâton(s).");

                // On retire les bâtons pris par l'ordinateur
                nbBatons = nbBatons - priseOrdinateur;

                // Si l'ordinateur prend le dernier bâton, il perd
                if (nbBatons == 0) {
                    System.out.println("L'ordinateur a pris le dernier bâton, il a perdu.");
                } else {
                    // Sinon c'est au tour du joueur
                    tourJoueur = true;
                }
            }
        }
    }
}