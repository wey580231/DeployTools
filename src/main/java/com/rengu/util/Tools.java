package com.rengu.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by hanchangming on 2017/4/19.
 */
public class Tools {
    public static int getLoginStatusCode(String username, String password, String boshDirectorIP) {
        int statusCode;
        if (username == null | password == null | boshDirectorIP == null) {
            System.out.println("用户名/密码/BoshDirectorIP为空");
            return 500;
        }

        try {
            OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .url("https://" + boshDirectorIP + ":25555/info")
                    .get()
                    .build();

            Response response = client.newCall(request).execute();
            statusCode = response.code();
            return statusCode;
        } catch (IOException e) {
            e.printStackTrace();
            return 500;
        }
    }
}
