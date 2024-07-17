package com.weather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 请求工具类
 */
public class HttpUtil {
    /**
     * 发送请求
     * @param address 请求的URL地址
     * @param callback 回调函数
     */
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
