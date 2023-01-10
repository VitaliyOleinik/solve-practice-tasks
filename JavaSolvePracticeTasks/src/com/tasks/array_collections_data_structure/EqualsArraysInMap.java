package com.tasks.array_collections_data_structure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EqualsArraysInMap {
    public static void main(String[] args) {
        Melon[] melons1Array = {
                new Melon("Apollo", 3000),
                new Melon("Jade Dew", 3500),
                new Melon("Cantaloupe", 1500)
        };

        Melon[] melons2Array = {
                new Melon("Apollo", 3000),
                new Melon("Jade Dew", 3500),
                new Melon("Cantaloupe", 1500)
        };

        Map<Integer, Melon[]> melons1ArrayMap = new HashMap<>();
        melons1ArrayMap.put(1, melons1Array);
        Map<Integer, Melon[]> melons2ArrayMap = new HashMap<>();
        melons2ArrayMap.put(1, melons2Array);
        // false
        boolean equals12ArrayMap = melons1ArrayMap.equals(melons2ArrayMap);
        // true
        System.out.println(equalsWithArrays(melons1ArrayMap, melons2ArrayMap));
    }

    public static <A,B> boolean equalsWithArrays(
            Map<A,B[]> first, Map<A,B[]> second) {
        if (first.size() != second.size()) {
            return false;
        }

        return first.entrySet().stream()
                .allMatch(e -> Arrays.equals(e.getValue(),
                        second.get(e.getKey())));
    }
}
