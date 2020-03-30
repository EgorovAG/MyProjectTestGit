package com.talwin.servletSalary;

import com.talwin.salary.Summa;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/summa")
public class SummaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        HttpSession session = req.getSession();
//        req.getSession().invalidate();

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/sum.jsp");
        requestDispatcher.forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String sum = req.getParameter("sum");
        String fszn = req.getParameter("fszn");
        String bgs = req.getParameter("bgs");
        String pdn = req.getParameter("pdn");
        String prfsz = req.getParameter("prfsz");

        Summa summa = new Summa(sum,fszn,bgs,pdn,prfsz);


        req.getSession().setAttribute("sum1", summa.getSum());
        req.getSession().setAttribute("sum_fszn", summa.getFszn());
        req.getSession().setAttribute("sum_bgs", summa.getBgs());
        req.getSession().setAttribute("sum_pdn", summa.getPdn());
        req.getSession().setAttribute("sum_prfsz", summa.getPrfsz());

        req.getRequestDispatcher("/salary.jsp").forward(req,resp);













    }
}
