package com.tasks.http_web_socket;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
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

    private void createBodyFromInputStream() {
        HttpRequest requestBodyOfInputStream = HttpRequest.newBuilder()
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofInputStream(()
                        -> inputStream("user.json")))
                .uri(URI.create("https://reqres.in/api/users"))
                .build();
    }

    private static ByteArrayInputStream inputStream(String fileName) {
        try (ByteArrayInputStream inputStream = new ByteArrayInputStream(
                Files.readAllBytes(Path.of(fileName)))) {
            return inputStream;
        } catch (IOException ex) {
            throw new RuntimeException("He получается прочитать файл", ex);
        }
    }
}
