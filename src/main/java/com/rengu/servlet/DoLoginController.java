package com.rengu.servlet;

import com.rengu.util.Tools;
import javafx.scene.control.Alert;

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
        int statueCode = Tools.getLoginStatusCode(username , password, boshDirectorIP);
        switch (statueCode){
            default:System.out.println(statueCode);break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
