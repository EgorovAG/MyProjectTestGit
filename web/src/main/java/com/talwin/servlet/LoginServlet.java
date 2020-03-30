package com.talwin.servlet;

import com.talwin.IService;
import com.talwin.User;
import com.talwin.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    IService iService = UserService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        Object authUser = req.getSession().getAttribute("authUser");
//        if(authUser==null){
        req.getRequestDispatcher("login.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        User user = new User(login, password);

        if (!iService.ServiceValidateL(user)){
//            req.getSession().setAttribute("authUser", user);
            req.setAttribute("error", "Вы ввели неверное имя или пароль либо Вам необходимо зарегистрироваться");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        } else  {
            resp.sendRedirect("systemIn.jsp");
        }
    }
}

