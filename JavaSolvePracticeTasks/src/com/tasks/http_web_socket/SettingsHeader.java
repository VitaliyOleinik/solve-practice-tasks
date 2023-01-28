package com.tasks.http_web_socket;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;

public class SettingsHeader {
    public static void main(String[] args) throws URISyntaxException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(""))
                .header("key1", "value1")
                .header("key2", "value2")
                .build();
        HttpRequest request1 = HttpRequest.newBuilder()
                .uri(new URI(""))
                .setHeader("key1", "value1")
                .setHeader("key2", "value2")
                .build();
        HttpRequest request2 = HttpRequest.newBuilder()
                .header("Content-Type", "application/json")
                .header("Referer", "https://reqres.in/")
                .uri(URI.create("https://reqres.in/api/users/2"))
                .build();
        HttpRequest request3 = HttpRequest.newBuilder()
                .setHeader("Content-Type", "application/json")
                .setHeader("Referer", "https://reqres.in/")
                .uri(URI.create("https://reqres.in/api/users/2"))
                .build();
        HttpRequest request4 = HttpRequest.newBuilder()
                .headers("Content-Type", "application/json", "Referer", "https://reqres.in/")
                .uri(URI.create("https://reqres.in/api/users/2"))
                .build();

    }
}
