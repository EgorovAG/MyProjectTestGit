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

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {

    IService iService = UserService.getInstance();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        String password = req.getParameter("password");

        User user = new User(login,password);

        if (iService.ServiceValidateR(user)){
            req.setAttribute("error", "пользователь с таким именем существует введите другое имя");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        } else  {
            iService.saveUser(user);
            resp.sendRedirect("/project/successRegistration");
        }
    }
}
