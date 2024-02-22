package com.tong.telegramBot.utils;

import okhttp3.*;

import java.io.IOException;
import java.util.Optional;

/**
 * Create by tong on 2023/1/2
 */
public class HttpUtils {

    private static final OkHttpClient client = new OkHttpClient();

    public static Optional<String> httpGet(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        try (Response response = client.newCall(request).execute()) {
            assert response.body() != null;
            return Optional.of(response.body().string());
        }
    }

    public static Optional<String> httpPost(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(json, MediaType.get("application/json; charset=utf-8"));
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            assert response.body() != null;
            return Optional.of(response.body().string());
        }
    }

}
