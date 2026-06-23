package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        // Création du scanner pour lire la saisie clavier
        Scanner sc = new Scanner(System.in);

        // Tableau de départ avec une capacité de 5 nombres
        int[] array = new int[5];

        // Nombre de cases réellement remplies dans le tableau
        int nbElements = 0;

        // Variable qui stocke le choix du menu
        int choix = 0;

        // Tant que l'utilisateur ne choisit pas 3, le menu continue
        while (choix != 3) {
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants");
            System.out.println("3. Quitter");
            System.out.println("Choisissez une option : ");
            choix = sc.nextInt();

            // Option 1 : ajouter un nombre dans le tableau
            if (choix == 1) {
                System.out.println("Entrez un nombre :");
                int nombre = sc.nextInt();

                // Si le tableau est plein, on crée un nouveau tableau plus grand
                if (nbElements == array.length) {
                    int[] newArray = new int[array.length * 2];

                    // On recopie les anciennes valeurs dans le nouveau tableau
                    for (int i = 0; i < array.length; i++) {
                        newArray[i] = array[i];
                    }

                    // Le tableau référence maintenant le nouveau tableau
                    array = newArray;
                }

                // On ajoute le nombre à la prochaine case libre
                array[nbElements] = nombre;
                nbElements++;

                // Option 2 : afficher les nombres déjà saisis
            } else if (choix == 2) {
                System.out.println("Contenu du tableau :");

                // On affiche seulement les cases remplies
                for (int i = 0; i < nbElements; i++) {
                    System.out.print(array[i] + " ");
                }

                // Si le choix n'est ni 1, ni 2, ni 3
            } else if (choix != 3) {
                System.out.println("Choix invalide");
            }
        }
    }
}