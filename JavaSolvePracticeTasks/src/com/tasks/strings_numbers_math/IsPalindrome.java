package com.tasks.strings_numbers_math;

import java.util.stream.IntStream;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("left"));
        System.out.println(isPalindromeFor("left"));
        System.out.println(isPalindromeStreams("left"));
    }

    private static boolean isPalindrome(String string) {
        int left = 0;
        int right = string.length() - 1;

        while (right > left) {
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    private static boolean isPalindromeFor(String s) {
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindromeStreams(String s) {
        return IntStream.range(0, s.length() / 2)
                .noneMatch(p -> s.charAt(p) !=
                        s.charAt(s.length() - p -1));
    }
}
