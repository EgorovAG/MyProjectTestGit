//package com.talwin.servlet;
//
//import com.talwin.Student;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//@WebServlet("/student")
//public class StudentServlet extends HttpServlet {
//   static List<Student> students = new ArrayList<>();
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setAttribute("students", students);
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/student.jsp");
//        requestDispatcher.forward(req,resp);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = req.getParameter("name");
//        String phone = req.getParameter("phone");
//        String email = req.getParameter("email");
//
//        Student student = new Student(name,phone,email);
//
//    }
//}
