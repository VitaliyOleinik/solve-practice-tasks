package com.tasks.array_collections_data_structure;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {
    public static void main(String[] args) {
        Map<String, Melon> melons = new HashMap<>();
        melons.put("refreshing", new Melon("Jade Dew", 3500));
        melons.put("famous", new Melon("Cantaloupe", 1500));
        melons.put("delicious", new Melon("Apollo", 3000));

        TreeMap<String, Melon> sortedMap = sortByKeyTreeMap(melons);
        sortedMap.forEach(
                (k, v) -> System.out.println("key: " + k + " value " + v));
    }

    public static <K, V> TreeMap<K, V> sortByKeyTreeMap(Map<K, V> map) {
        return new TreeMap<>(map);
    }

    public static class Melon implements Comparable {
        private final String type;
        private final int weight;

        public Melon(String type, int weight) {
            this.type = type;
            this.weight = weight;
        }

        @Override
        public int compareTo(Object o) {
            return Integer.compare(this.getWeight(), ((Melon) o).getWeight());
        }

        public String getType() {
            return type;
        }

        public int getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return "Melon{" +
                    "type='" + type + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }
}
