<%@ page import="com.mukeshmahara.myblogs2.dao.PostDao" %>
<%@ page import="com.mukeshmahara.myblogs2.helper.ConnectionProvider" %>
<%@ page import="com.mukeshmahara.myblogs2.entities.Post" %>
<%@ page import="java.util.List" %>

<%--Loading the post content in the page--%>

<%@include file="components/bootstrap/bootstrap_css.jsp"%>

<%
    PostDao postDao = new PostDao(ConnectionProvider.getCon());
    List<Post> posts = null;

    int cid = Integer.parseInt(request.getParameter("cid"));
    if (cid == 0) {
        posts = postDao.getAllPosts();
    } else {
        posts = postDao.getPostById(cid);
    }
    if (posts.isEmpty()) {
        response.getWriter().println("<h3 class='display-3 text-center' style='margin-top:20%;'>" + "No post in this category" + "</h3>");
        return;

    }
    for (Post p : posts) {
%>


<div class="col-md-6">
    <div class="card mt-2">
        <div class="card-body">
            <img src="pics/post_pics/<%=p.getPic()%>" class="card-img-top" alt="">
            <b>
                <%=p.getPtitle()%>
            </b>
            <p><%=p.getPcontent()%>
            </p>

        </div>
        <div class="card-footer text-muted margin-left">


            <a href="#!" class="btn btn-outline-primary btn-sm"><i class="fa fa-comment-o "></i><span>10</span></a>

            <a href="#!" class="btn btn-outline-primary btn-sm"><i class="fa fa-thumbs-o-up"></i><span>20</span></a>

            <a href="post.jsp?post_id=<%=p.getPid()%>" class="btn btn-outline-primary btn-sm">Read More...</a>


        </div>

    </div>


</div>

<%
    }


%>
