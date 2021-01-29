package com.mukeshmahara.myblogs2.servlets;

import com.mukeshmahara.myblogs2.dao.UserDao;
import com.mukeshmahara.myblogs2.entities.User;
import com.mukeshmahara.myblogs2.helper.ConnectionProvider;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.*;
import java.io.IOException;


@MultipartConfig
public class Edit_User_Info extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        resp.setContentType("text/html");

//Fetching all Updated users data
        Part part = req.getPart("user_image");
        String image_name = part.getSubmittedFileName();

        String email = req.getParameter("user_email");
        String phone = req.getParameter("user_phone");
        String address = req.getParameter("user_address");
        System.out.println(image_name);

        HttpSession session = req.getSession();

        User user = (User) session.getAttribute("current_user");

        user.setEmail(email);
        user.setPhone(phone);
        user.setAddress(address);
        user.setUser_image(image_name);

        UserDao dao = new UserDao(ConnectionProvider.getCon());

        boolean status = dao.updateUserInfo(user);
        if (status) {
            resp.getWriter().println("Data updated succesfully");
        } else
            resp.getWriter().println("Error occured while updating data");
    resp.sendRedirect("profile.jsp");
    }

}
