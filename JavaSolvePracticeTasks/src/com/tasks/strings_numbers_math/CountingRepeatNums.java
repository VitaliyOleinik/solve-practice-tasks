package com.tasks.strings_numbers_math;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingRepeatNums {
    public static void main(String[] args) {
        System.out.println(countDuplicateCharacters("22341"));
        System.out.println(countDuplicateCharactersStreams("22341"));
    }

    private static Map<Character, Integer> countDuplicateCharacters(String string) {
        Map<Character, Integer> result = new HashMap<>();

        for (char ch: string.toCharArray()) {
            result.compute(ch, (key, value) -> (value == null) ? 1 : ++value);
        }
        return result;
    }
    private static Map<Character, Long> countDuplicateCharactersStreams(String string) {
        Map<Character, Long> result = string.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }
}
