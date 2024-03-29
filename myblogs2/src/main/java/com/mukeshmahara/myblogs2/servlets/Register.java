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
import java.io.PrintWriter;


public class Register extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        resp.setContentType("text/html");

        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String address = req.getParameter("address");
        String phone = req.getParameter("phone");
        String gender = req.getParameter("gender");
        String check = req.getParameter("check");
//        System.out.println(timestamp);
        System.out.println("Im register servlet . I worked fine transferring control to User entity");

//        creating a user entities object and set all the data to the user object

        User user = new User(username, email, password, gender, address, phone);

//        creating a userdoa object and establishing connection to database


        UserDao dao = new UserDao(ConnectionProvider.getCon());
        if (dao.saveUser(user)) {
            Message reg_msg = new Message("Registration success..", "success", "alert-success");
            HttpSession s = req.getSession();
            s.setAttribute("reg", reg_msg);
            resp.sendRedirect("login_page.jsp");
        } else {
            System.out.println("Error!!");
            Message reg_msg = new Message("Something went wrong..Please try again with correct parameters!! ", "Error", "alert-danger");
            HttpSession s = req.getSession();
            s.setAttribute("regFail", reg_msg);
            resp.sendRedirect("register_page.jsp");

        }


    }

}
