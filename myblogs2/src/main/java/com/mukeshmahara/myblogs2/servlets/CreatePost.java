package com.mukeshmahara.myblogs2.servlets;

import com.mukeshmahara.myblogs2.dao.PostDao;
import com.mukeshmahara.myblogs2.entities.Post;
import com.mukeshmahara.myblogs2.entities.User;
import com.mukeshmahara.myblogs2.helper.ConnectionProvider;
import com.mukeshmahara.myblogs2.helper.Helper;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;

@MultipartConfig
public class CreatePost extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);

        int cid = Integer.parseInt(req.getParameter("cid"));
        String ptitle = req.getParameter("ptitle");
        String pcontent = req.getParameter("pcontent");
        Part part = req.getPart("postpic");

//        Getting current id
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("current_user");

        Post post = new Post(ptitle, pcontent, part.getSubmittedFileName(), null, cid, user.getId());
        PostDao postDao = new PostDao(ConnectionProvider.getCon());
        if (postDao.savePost(post)) {

            String path = req.getServletContext().getRealPath("/") +"pics"+File.separator+ "post_pics" + File.separator + part.getSubmittedFileName();

            Helper.saveFile(part.getInputStream(), path);

            resp.getWriter().println("done");
        } else {
            resp.getWriter().println("Error!!");
        }

    }
}
