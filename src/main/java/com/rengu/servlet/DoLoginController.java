package com.rengu.servlet;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by hanchangming on 2017/4/19.
 */
public class DoLoginController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("inputBoshDirectorUsername");
        String password = request.getParameter("inputBoshDirectorPassword");
        String boshDirectorIP = request.getParameter("BoshDirectorIP");

        OkHttpClient okHttpClient = new OkHttpClient();

        Request okHttpRequest = new Request.Builder()
                .url("https://" + username + ":" + password + "@" + boshDirectorIP + ":25555/tasks")
                .get()
                .build();

        Response okHttpResponse = okHttpClient.newCall(okHttpRequest).execute();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
