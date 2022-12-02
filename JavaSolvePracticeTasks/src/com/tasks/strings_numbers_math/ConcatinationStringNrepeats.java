package com.tasks.strings_numbers_math;

public class ConcatinationStringNrepeats {
    public static void main(String[] args) {
        System.out.println(concatRepeat("Privet", 17));
    }

    private static String concatRepeat(String s, int n) {
        StringBuilder sb = new StringBuilder(s.length() * n);
        for (int i = 1; i <= n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}
