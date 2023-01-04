package com.tasks.array_collections_data_structure;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ComputeIfAbsent {
    public static void main(String[] args) throws UnknownHostException {
        Map<String, String> map = new HashMap<>();
        map.put("postgresql", "jdbc:postgresql://127.0.0.l/customers_db");
        map.put("mysql", "jdbc:mysql://192.168.0.50/customers_db");

        String address = InetAddress.getLocalHost().getHostAddress();
        Function<String, String> jdbcUrl
                = k -> k +"://" + address + "/customers_db";
        System.out.println(address);
        System.out.println(jdbcUrl);
        // mongodb://192.168.100.10/customers_db
        String mongodbJdbcUrl = map.computeIfAbsent("mongodb", jdbcUrl);
        String postgresqlJdbcUrl = map.computeIfAbsent("postgresql", jdbcUrl);
        String mysqlJdbcUrl = map.computeIfAbsent("mysql", jdbcUrl);
        System.out.println(mongodbJdbcUrl);
        System.out.println(postgresqlJdbcUrl);
        System.out.println(mysqlJdbcUrl);
    }
}
