package com.tasks.array_collections_data_structure;

import java.util.HashMap;
import java.util.Map;

public class DeleteElementFromViewOfMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "postgresql");
        map.put(2, "mysql");
        map.put(3, "derby");
        String r1 = map.remove(1); // postgresql
        String r2 = map.remove(4); // null
        // map of 2 and 3 keys
        // true
        boolean ex1 = map.remove(2, "mysql");
        // false (key is exist and value not equal)
        boolean ex2 = map.remove(3, "mysql");
        // key: 3 value: derby
        map.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
    }
}
