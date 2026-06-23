package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 4, 5, 2};

        boolean resultat = nums.length > 0 && nums[0] == nums[nums.length - 1];

        System.out.println(resultat);

    }
}
