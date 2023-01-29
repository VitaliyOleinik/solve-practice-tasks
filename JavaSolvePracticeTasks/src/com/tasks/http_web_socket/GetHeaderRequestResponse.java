package com.tasks.http_web_socket;

import java.net.http.HttpHeaders;
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
}
