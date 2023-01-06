package com.tasks.array_collections_data_structure;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Compute {
    public static void main(String[] args) throws UnknownHostException {
        Map<String, String> map = new HashMap<>();
        map.put("postgresql", "127.0.0.1");
        map.put("mysql", "192.168.0.50");

        String address = InetAddress.getLocalHost().getHostAddress();
        BiFunction<String, String, String> jdbcUrl = (k, v)
            -> "jdbc:" + k + "://" + ((v == null) ? address : v)
                + "/customers_db";
        String mysqlJdbcUrl = map.compute("mysql", jdbcUrl);
        // jdbc:mysql://192.168.0.50/customers_db
        System.out.println(mysqlJdbcUrl);
        String derbyJdbcUrl = map.compute("derby", jdbcUrl);
        // jdbc:derby://172.24.96.1/customers_db
        System.out.println(derbyJdbcUrl);
    }
}
