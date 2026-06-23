package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir un nombre entre 1 et 10: ");
        int nb =scanner.nextInt();

        while(nb < 1 || nb > 10){
            System.out.println("Nombre invalide, veuillez recommencer : ");
            nb = scanner.nextInt();
        }

        System.out.println("Table de " + " : ");

        for(int i = 1; i <= 10; i++){
            System.out.println(nb + " * " + i + " = " +(nb * i));
        }
    }
}
