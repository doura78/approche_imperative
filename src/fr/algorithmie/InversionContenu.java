package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] arrayCopy = new int[array.length];

        for (int i = 0; i < arrayCopy.length; i++) {
            arrayCopy[i] = array[i];
        }
        for (int i = arrayCopy.length - 1; i >= 0; i--) {
            System.out.println(arrayCopy[i]);
        }

        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.println(array[i]);
        }
    }
}
