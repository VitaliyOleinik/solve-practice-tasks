package com.tasks.http_web_socket;

import java.net.URI;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

public class GetHeaderRequestResponse {
    public static void main(String[] args) {
        HttpResponse response = null;
        HttpHeaders allHeaders = response.headers();
        List<String> allValuesOfCacheControl
                = response.headers().allValues("Cache-Control");
        Optional<String> firstValueOfCacheControl
                = response.headers().firstValue("Cache-Control");
    }

    private void settingsOfMethodsHTTP() {
        HttpRequest requestGet = HttpRequest.newBuilder()
                .GET() // can be omitted since it is default
                .uri(URI.create("https://reqres.in/api/users/2"))
                .build();

        HttpRequest requestPost = HttpRequest.newBuilder()
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(
                        "{\"name\": \"morpheus\",\"job\": \"leader\"}"))
                .uri(URI.create("https://reqres.in/api/users"))
                .build();

        HttpRequest requestPut = HttpRequest.newBuilder()
                .header("Content-Type", "application/json")
                .PUT(HttpRequest.BodyPublishers.ofString(
                        "{\"name\": \"morpheus\",\"job\": \"zion resident\"}"))
                .uri(URI.create("https://reqres.in/api/users/2"))
                .build();

        HttpRequest requestDelete = HttpRequest.newBuilder()
                .DELETE()
                .uri(URI.create("https://reqres.in/api/users/2"))
                .build();
    }

    private void createBodyFromString() {
        HttpRequest requestBody = HttpRequest.newBuilder()
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(
                        "{\"name\": \"morpheus\",\"job\": \"leader\"}"))
                .uri(URI.create("https://reqres.in/api/users"))
                .build();
    }
}
