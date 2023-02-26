package org.example;

public class Task1 {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";

        int left = 0;
        int right = str.length() - 1;
        boolean cheak = true;

        while (left < right) {
            if (Character.isAlphabetic(str.charAt(left))) {
                if (Character.isAlphabetic(str.charAt(right))) {
                    if (str.toLowerCase().charAt(left) != str.toLowerCase().charAt(right)) {
                        cheak = false;
                        break;
                    }
                    left++;
                }
                right--;
            } else left++;
        }
        System.out.println("palindrome " + cheak);
    }
}
