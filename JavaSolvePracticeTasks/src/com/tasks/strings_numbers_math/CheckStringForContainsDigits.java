package com.tasks.strings_numbers_math;

public class CheckStringForContainsDigits {
    public static void main(String[] args) {
        System.out.println(containsOnlyDigits("12346"));
        System.out.println(containsOnlyDigitsStreams("12346"));
        System.out.println(containsOnlyDigitsRegEx("12346"));
    }

    private static boolean containsOnlyDigits(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isDigit(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean containsOnlyDigitsStreams(String string) {
        return !string.chars()
                .anyMatch(n -> !Character.isDigit(n));
    }

    private static boolean containsOnlyDigitsRegEx(String str) {
        return str.matches("[0-9]+");
    }

}
