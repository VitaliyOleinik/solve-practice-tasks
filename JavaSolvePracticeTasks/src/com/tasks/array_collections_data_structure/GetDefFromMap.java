package com.tasks.array_collections_data_structure;

import java.util.HashMap;
import java.util.Map;

public class GetDefFromMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("postgresql", "127.0.0.1:5432");
        map.put("mysql", "192.168.0.50:3306");
        map.put("cassandra", "192.168.1.5:9042");
        map.get("derby");
        String hp1 = map.getOrDefault("derby", "69:89.31.226:27017");
        String hp2 = map.getOrDefault("mysql", "69:89.31.226:27017");
        System.out.println(hp1);
        System.out.println(hp2);
    }
}
