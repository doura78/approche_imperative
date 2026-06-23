package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez sasir un nombre : ");
        int nb = scanner.nextInt();

        for (int i = nb + 1; i <= nb + 10; i++) {
            System.out.println(i);
        }
    }
}
