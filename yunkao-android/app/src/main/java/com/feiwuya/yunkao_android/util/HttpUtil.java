package com.feiwuya.yunkao_android.util;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class HttpUtil {
    private static final OkHttpClient client = new OkHttpClient();

    /**
     * get 请求
     * @param url
     * @param callback
     */
    public static void get(String url, final Callback callback) {
        Request request = new Request.Builder().url(url).build();
        client.newCall(request).enqueue(callback);
    }

    /**
     * Post 请求
     * @param url
     * @param json
     * @param callback
     */
    public static void post(String url, String json, final Callback callback) {
        RequestBody body = RequestBody.create(json, MediaType.parse("application/json; charset=utf-8"));
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        client.newCall(request).enqueue(callback);
    }
}
