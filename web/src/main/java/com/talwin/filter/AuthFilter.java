package com.talwin.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

//@WebServlet("/student")
public class AuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        Object authUser = req.getSession().getAttribute("authUser");
        if(authUser == null) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/login.jsp");
            requestDispatcher.forward(servletRequest,servletResponse);
        }


    }

    @Override
    public void destroy() {

    }
}
