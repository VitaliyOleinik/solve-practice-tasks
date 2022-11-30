package com.tasks.strings_numbers_math;

import java.util.stream.IntStream;

public class PermuteAll {
    public static void main(String[] args) {
        permuteAndPrint("A", "ABC");
    }

    private static void permuteAndPrint(String prefix, String string) {
        int length = string.length();

        if (length == 0) {
            System.out.println(prefix + " ");
        } else {
            for (int i = 0; i < length; i++) {
                permuteAndPrint(prefix + string.charAt(i),
                        string.substring(i + 1, length) + string.substring(0, i));
            }
        }
    }

    private static void permuteAndPrintStream(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.print(prefix + " ");
        } else {
            IntStream.range(0, n)
                    .parallel()
                    .forEach(i -> permuteAndPrintStream(prefix + str.charAt(i),
                            str.substring(i + 1, n) + str.substring(0, i)));
        }
    }
}
