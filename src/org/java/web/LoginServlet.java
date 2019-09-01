package org.java.web;

import java.io.IOException;


@javax.servlet.annotation.WebServlet(name = "login", urlPatterns = "/login")
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("name");
        System.out.println(name);
        if (name.equals("jack")) {
            request.getRequestDispatcher("ok.jsp").forward(request, response);
        } else {
            response.sendRedirect("index.jsp");
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
