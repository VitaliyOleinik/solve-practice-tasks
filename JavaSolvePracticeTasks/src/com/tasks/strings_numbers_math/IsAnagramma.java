package com.tasks.strings_numbers_math;

public class IsAnagramma {
    public static void main(String[] args) {
        System.out.println(isAnagram("H  e ll o", "O l   L e H"));
    }

    private static final int EXTENDED_ASCII_CODES = 256;

    private static boolean isAnagram(String str1, String str2) {
        int[] chCounts = new int[EXTENDED_ASCII_CODES];
        char[] chStr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] chStr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();

        if (chStr1.length != chStr2.length) {
            return false;
        }

        for (int i = 0; i < chStr1.length; i++) {
            chCounts[chStr1[i]]++;
            chCounts[chStr2[i]]--;
        }

        for (int chCount : chCounts) {
            if (chCount != 0) {
                return false;
            }
        }

        return true;
    }
}
