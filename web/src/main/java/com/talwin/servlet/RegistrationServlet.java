package com.talwin.servlet;

import com.talwin.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Service;
import java.io.IOException;
import java.net.UnknownServiceException;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {

    IService iService = UserService.getInstance();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {




        String login = req.getParameter("login");
        String password = req.getParameter("password");

        User user = new User(login,password);




    }
}
