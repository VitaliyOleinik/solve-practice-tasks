package com.tasks.http_web_socket;

import java.net.InetSocketAddress;
import java.net.http.HttpClient;

public class ProxySelector {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newBuilder()
                .proxy(java.net.ProxySelector.of(new InetSocketAddress("proxy.host", 80)))
                .build();
//        HttpClient alternativeClient = HttpClient.newBuilder()
//                .proxy(ProxySelector.getDefault)
//                .build();
    }
}
