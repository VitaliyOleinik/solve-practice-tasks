package com.tasks.http_web_socket;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIWebSocket {
    public static void main(String[] args) throws IOException, InterruptedException {
        // инициализация асинхронного запроса GET
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://reqres.in/api/users/2"))
                .build();
        HttpResponse<String> response
                = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status code: " + response.statusCode());
        System.out.println("\n Body: " + response.body());
    }
}
