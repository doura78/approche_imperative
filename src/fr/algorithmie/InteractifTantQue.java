package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        // Création du scanner pour lire au clavier
        Scanner scanner = new Scanner(System.in);

        // On demande une première saisie
        System.out.println("Veuillez saisir un nombre entre 1 et 10: ");
        int nb = scanner.nextInt();

        // Tant que le nombre n'est pas compris entre 1 et 10
        while (nb < 1 || nb > 10) {
            // On redemande une nouvelle valeur
            System.out.println("Nombre invalide, veuillez recommencer : ");
            nb = scanner.nextInt();
        }
        // Affichage du nombre valide
        System.out.println("Le nombre saisi est : " + nb);
    }
}
