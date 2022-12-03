package com.tasks.strings_numbers_math;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] texts = {"abc", "abed", "abode", "ab", "abed", "abedef"};
        System.out.println(longestCommonPrefix(texts));
    }
    private static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        int firstLen = strs[0].length();

        for (int prefixLen = 0; prefixLen < firstLen; prefixLen++) {
            char ch = strs[0].charAt(prefixLen);
            for (int i = 1; i < strs.length; i++) {
                if (prefixLen >= strs[i].length()
                    || strs[i].charAt(prefixLen) != ch) {
                    return strs[i].substring(0, prefixLen);
                }
            }
        }
        return strs[0];
    }
}
