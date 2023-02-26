package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        int[] nums = {3, 2, 4, 2, 1, 6, 3, 4, 8, 2, 2, 1, 3, 4, 5, 6, 2, 4, 9, 7, 4, 5, 1, 1, 5, 3, 6, 6, 8, 8, 7, 5, 4};
        int target = 10;

        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i] + nums[i + 1];
            if (sum == target) {
                List<Integer> answer = new ArrayList<>();
                answer.add(i);
                answer.add(i + 1);
                System.out.println(answer);
                break;
            }
        }
    }
}
