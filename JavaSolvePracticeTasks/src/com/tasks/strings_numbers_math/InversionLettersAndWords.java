package com.tasks.strings_numbers_math;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class InversionLettersAndWords {
    private static final String WHITESPACE = " ";

    public static void main(String[] args) {
        System.out.println(reverseWords("Привет! Как дела?"));
        System.out.println(reverseWordsStreams("Нормально, а у тебя как дела?"));
        System.out.println(reverse("Отлично"));
    }

    private static String reverseWords(String string) {
        String[] words = string.split(WHITESPACE);
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord.append(word.charAt(i));
            }
            reversedString.append(reverseWord).append(WHITESPACE);
        }

        return reversedString.toString();
    }

    private static final Pattern PATTERN = Pattern.compile(" +");

    private static String reverseWordsStreams(String string) {
        return PATTERN.splitAsStream(string)
                .map(w -> new StringBuilder(w).reverse())
                .collect(Collectors.joining(" "));
    }

    private static String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
