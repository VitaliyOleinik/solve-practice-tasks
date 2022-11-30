package com.tasks.strings_numbers_math;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FindSymbolMoreRepeated {
    public static void main(String[] args) {
        System.out.println(maxOccurrenceCharacter("SSStrIInGG"));
    }

    private static Map<Character, Integer> maxOccurrenceCharacter(String s) {
        Map<Character, Integer> counter = new HashMap<>();
        char[] chStrings = s.toCharArray();

        for (int i = 0; i < chStrings.length; i++) {
            char currentCh = chStrings[i];
            // ignore whitespace
            if (!Character.isWhitespace(currentCh)) {
                Integer countRepeatCh = counter.get(currentCh);
                if (countRepeatCh == null) {
                    counter.put(currentCh, 1);
                } else {
                    counter.put(currentCh, ++countRepeatCh);
                }
            }
        }

        int maxOccurrences = Collections.max(counter.values());
        char maxCharacter = Character.MIN_VALUE;

        for (Map.Entry<Character, Integer> entry: counter.entrySet()) {
            if (entry.getValue() == maxOccurrences) {
                maxCharacter = entry.getKey();
            }
        }

        return Map.of(maxCharacter, maxOccurrences);
    }

    private static Map<Character, Long> maxOccurrenceCharacterStreams(String s) {
        return s.chars()
                .filter(c -> Character.isWhitespace(c) == false)
                .mapToObj(c -> (char) c)
                .collect(groupingBy(c -> c, counting()))
                .entrySet()
                .stream()
                .max(comparingByValue())
                .map(p -> Map.of(p.getKey(), p.getValue()))
                .orElse(Map.of(Character.MIN_VALUE, -1L));
    }
}
