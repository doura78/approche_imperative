package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Voici l'affichage des nombres :");
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        for (i = 1; i <= 9; i += 2) {
            System.out.println(i);
        }

        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }

        int k = 0;
        while (k <= 10) {
            System.out.println(k);
            k += 2;
        }
        int l = 1;
        while (l <= 9) {
            System.out.println(l);
            l += 2;
        }
    }
}

