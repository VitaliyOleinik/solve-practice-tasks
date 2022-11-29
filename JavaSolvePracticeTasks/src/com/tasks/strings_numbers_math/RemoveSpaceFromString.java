package com.tasks.strings_numbers_math;

public class RemoveSpaceFromString {
    public static void main(String[] args) {
        System.out.println(removeSpaces("Hello  !  ho w! are !  you ?  "));
    }

    private static String removeSpaces(String string) {
        return string.replaceAll("\\s", "");
    }
}
