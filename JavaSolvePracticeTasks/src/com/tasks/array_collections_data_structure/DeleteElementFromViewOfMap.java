package com.tasks.array_collections_data_structure;

import java.util.HashMap;
import java.util.Map;

public class DeleteElementFromViewOfMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "postgresql");
        map.put(2, "mysql");
        map.put(3, "derby");
        String r1 = map.remove(1);
        String r2 = map.remove(4);
    }
}
