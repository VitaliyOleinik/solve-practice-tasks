package com.tasks.strings_numbers_math;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatedCharacter("11223344556677889"));
        System.out.println("---___---___---___---___---___---___---___---___---___---___");
        System.out.println(firstNonRepeatedCharacterMap("11223344556677889"));
        System.out.println("---___---___---___---___---___---___---___---___---___---___");
        System.out.println(firstNonRepeatedCharacterStream("11223344556677889"));
    }

    private static final int EXTENDED_ASCII_CODES = 256;

    private static char firstNonRepeatedCharacter(String string) {
        int[] flags = new int[EXTENDED_ASCII_CODES];
        for (int i = 0; i < flags.length; i++) {
            flags[i] = -1;
        }

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (flags[ch] == -1) {
                flags[ch] = i;
            } else {
                flags[ch] = -2;
            }
        }

        int position = Integer.MAX_VALUE;
        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
            if (flags[i] >= 0) {
                position = Math.min(position, flags[i]);
            }
        }

        return position == Integer.MAX_VALUE ?
                Character.MIN_VALUE : string.charAt(position);
    }

    private static char firstNonRepeatedCharacterMap(String string) {
        Map<Character, Integer> chars = new LinkedHashMap<>();

        for (char ch : string.toCharArray()) {
            chars.compute(ch, (key, value) -> (value == null) ? 1 : ++value);
        }

        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return Character.MIN_VALUE;
    }

    private static String firstNonRepeatedCharacterStream(String string) {
        Map<Integer, Long> chars = string.codePoints()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));
        int cp = chars.entrySet().stream()
                .filter(e -> e.getValue() == 1L)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse((int) Character.MIN_VALUE);

        return String.valueOf(Character.toChars(cp));
    }
}
