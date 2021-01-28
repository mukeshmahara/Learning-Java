package com.mukeshmahara.myblogs2.servlets;

import com.mukeshmahara.myblogs2.dao.UserDao;
import com.mukeshmahara.myblogs2.entities.Message;
import com.mukeshmahara.myblogs2.entities.User;
import com.mukeshmahara.myblogs2.helper.ConnectionProvider;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;


public class Login extends HttpServlet {
    boolean state = false;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


//        fetching login form data
        String email = req.getParameter("email");
        String password = req.getParameter("password");
//        getting connection


        UserDao dao = new UserDao(ConnectionProvider.getCon());


        try {
            User user = dao.getUserByEmailAndPassword(email, password);
//
            if (user == null) {
                Message msg = new Message("invalid Credentials!!", "error", "alert-danger");
                HttpSession session = req.getSession();
                session.setAttribute("msg", msg);
                resp.sendRedirect("login_page.jsp");
            } else {

                HttpSession session = req.getSession();
                session.setAttribute("current_user", user);
                resp.sendRedirect("profile.jsp");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}


