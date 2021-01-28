package com.mukeshmahara.myblogs2.servlets;

import com.mukeshmahara.myblogs2.entities.Message;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Logout extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        resp.setContentType("text/html");
        HttpSession session = req.getSession();
        session.removeAttribute("current_user");

        Message m = new Message("Logout Successfully","Success","alert-success");
        session.setAttribute("msg",m);

        resp.sendRedirect("login_page.jsp");




    }
}
