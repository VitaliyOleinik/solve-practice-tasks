package com.tasks.strings_numbers_math;

public class CountRepeatSubString {
    public static void main(String[] args) {
        System.out.println(countStringInString("123321123", "123"));
    }

    private static int countStringInString(String string, String toFind) {
        int position = 0;
        int count = 0;
        int n = toFind.length();

        while ((position = string.indexOf(toFind, position)) != -1) {
            position = position + n;
            count++;
        }
        return count;
    }
}
