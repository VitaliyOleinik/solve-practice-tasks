package com.tasks.array_collections_data_structure;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Merge {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("postgresql", "9.6.1 ");
        map.put("mysql", "5.1 5.2 5.6 ");
        BiFunction<String, String, String> jdbcUrl = String::concat;
        BiFunction<String, String, String> jdbcUrl1
                = (valueOld, valueNew) -> valueOld.concat(valueNew);
        String mySqlVersion8_0 = map.merge("mysql", "8.0 ", jdbcUrl);
        // mysql=5.1 5.2 5.6 8.0
        System.out.println("mysql=" + mySqlVersion8_0);
        String mySqlVersion9_0 = map.merge("mysql", "9.0 ", jdbcUrl);
        // mysql=5.1 5.2 5.6 8.0 9.0
        System.out.println("mysql=" + mySqlVersion9_0);
        String derbyVersion = map.merge("derby", "10.11.1.1 ", jdbcUrl1);
        // derby=10.11.1.1
        System.out.println("derby=" + derbyVersion);
        // postgresql=9.6.1
        System.out.println("postgresql=" + map.get("postgresql"));
    }
}
