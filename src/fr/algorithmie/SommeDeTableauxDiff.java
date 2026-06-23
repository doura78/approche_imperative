package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};

        int maxLength = Math.max(array1.length, array2.length);
        int[] sumArray = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            if (i < array1.length && i < array2.length) {
                sumArray[i] = array1[i] + array2[i];
            } else if
            (i < array1.length) {
                sumArray[i] = array1[i];
            } else {
                sumArray[i] = array2[i];
            }

        }
        System.out.println("la somme des deux tableaux est: ");
        for (int i = 0; i < sumArray.length; i++) {
            System.out.print(sumArray[i] + " ");
        }
    }
}
