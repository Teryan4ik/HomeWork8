package org.example;

import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {

        int[] array = {1, 4, 5, 3, 2, 1, 7, 6, 2, 3, 8, 6, 1, 9};
        HashSet<Integer> nums = new HashSet<>();
        boolean cheak = true;

        while (cheak) {
            for (int n : array) {
                if (nums.contains(n)) {
                    System.out.println(nums);   // delete
                    System.out.println("contains " + n);    // delete
                    cheak = false;
                    break;
                } else nums.add(n);
            }
        }
        System.out.println(cheak);
    }
}
