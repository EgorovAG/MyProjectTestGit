package com.talwin.servlet;

import com.talwin.User;
import com.talwin.ListUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Object authUser = req.getSession().getAttribute("authUser");
        if(authUser==null){
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
        req.getRequestDispatcher("/menu.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
//        User user =  new User(login, password);


//            rq.setAttribute("error", "login or password invalid");

        User user = new User(login, password);

        if (ListUser.addList(user)){
            req.getSession().setAttribute("authUser", user);
            req.setAttribute("error", "пользователь с таким именем существует введите другое имя");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
            } else  {
                resp.sendRedirect("systemIn.jsp");
            }
    }
}

