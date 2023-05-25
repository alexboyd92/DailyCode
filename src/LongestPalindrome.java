package src;

import java.util.Scanner;

public class LongestPalindrome {
    public static String findLongestPalindrome(String input) {
        input= input.toLowerCase();
        int n = input.length();
        if (n == 0)
            System.out.println("String is empty");
        if (n == 1)
            System.out.println("The longest palidromic substring is " + input);

        int minstart = 0, maxlen = 0;

        for (int i = 0; i < n; ) {
            if (n - i < maxlen / 2)
                break;

            int leftIndex = i, rightIndex = i;

            // Find the center of the palindrome
            while (rightIndex < n - 1 && input.charAt(rightIndex) == input.charAt(rightIndex + 1))
                rightIndex++;

            // Update the next starting point
            i = rightIndex + 1;

            // Expand around the center to find the longest palindrome
            while (leftIndex > 0 && rightIndex < n - 1 && input.charAt(leftIndex - 1) == input.charAt(rightIndex + 1)) {
                leftIndex--;
                rightIndex++;
            }

            int newlen = rightIndex - leftIndex + 1;
            if (newlen > maxlen) {
                maxlen = newlen;
                minstart = leftIndex;
            }
        }

        return input.substring(minstart, minstart + maxlen);
    }
    public static void cmdImput() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter string");
        String input = userInput.next();

        System.out.println("The longest palindromic substring is: "+findLongestPalindrome(input));
    }
}
