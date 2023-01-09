package com.tasks.array_collections_data_structure;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;

public class RefreshElementInMap {
    public static void main(String[] args) {
        Map<Integer, Melon> mapOfMelon = new HashMap<>();
        mapOfMelon.put(1, new Melon("Apollo", 3000));
        mapOfMelon.put(2, new Melon("Jade Dew", 3500));
        mapOfMelon.put(3, new Melon("Cantaloupe", 1500));
        // дыня Jade Dew(3500g) была заменена
        Melon replacedMelon = mapOfMelon.replace(2, new Melon("Gac", 1000));
        // true (from old to new value)
        boolean melon = mapOfMelon.replace(
                1, new Melon("Apollo", 3000), new Melon("Bitter", 4300));
        // replaceAll with BiFunction
        // answer:  key: 1 value: Melon{type='Bitter', weight=1000}
        //          key: 2 value: Melon{type='Gac', weight=1000}
        //          key: 3 value: Melon{type='Cantaloupe', weight=1000}
        BiFunction<Integer, Melon, Melon> function = (k,v)
            -> v.getWeight() > 1000 ? new Melon(v.getType(), 1000) : v;
        mapOfMelon.replaceAll(function);
        mapOfMelon.forEach((k,v) -> System.out.println("key: " + k + " value: " + v));
    }
}

class Melon {
    private final String type;
    private final int weight;

    public Melon(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Melon melon = (Melon) o;
        return weight == melon.weight && Objects.equals(type, melon.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, weight);
    }

    @Override
    public String toString() {
        return "Melon{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}
