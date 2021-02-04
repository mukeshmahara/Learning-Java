<%@ page import="com.mukeshmahara.myblogs2.dao.PostDao" %>
<%@ page import="com.mukeshmahara.myblogs2.helper.ConnectionProvider" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="com.mukeshmahara.myblogs2.entities.Post" %>
<%@ page import="java.util.List" %>
<%@ page import="com.mukeshmahara.myblogs2.dao.UserDao" %>
<%@page errorPage="error_page.jsp" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>

    <title>Blogs</title>
    <%@include file="components/bootstrap/bootstrap_css.jsp" %>

    <link rel="stylesheet" href="components/custom_css/style.css">

</head>
<body>
<%@include file="components/navbar.jsp" %>

<main>
    <%
        User user = null;
        String post_ID = request.getParameter("post_id");
        UserDao userDao = new UserDao(ConnectionProvider.getCon());
        PostDao postDao = new PostDao(ConnectionProvider.getCon());

        if (post_ID == null) {
            List<Post> list = postDao.getAllPosts();
    %>
    <div class="row m-0 p-o">
        <div class="col-md-12">
            <div class="row">

                <%
                    for (Post p : list) {
                %>
                <div class="col-md-4">
                    <div class="card  mt-2">
                        <div class="card-body">
                            <img class="card-img-top" src="pics/post_pics/<%=p.getPic()%>" alt="img">

                            <h3><%=p.getPtitle()%>
                            </h3>
                            <p><%=p.getPcontent()%>
                            </p>
                        </div>
                        <div class="card-footer">
                            <%
                                user = userDao.getUserById(p.getUid());
                            %>
                            posted By : <img src="pics/profile_pic/<%=user.getProfile()%>"
                                             style="border-radius: 50%; width: 30px; height:30px;"
                                             alt="profile"><%=user.getUsername()%> ,<%=user.getAddress()%>
                        </div>
                    </div>
                </div>
                <%
                    }
                } else {
                    int post_id = Integer.parseInt(post_ID);

                    List<Post> list = postDao.getPostByPostId(post_id);

                    for (Post p : list) {

                %>

                <div class="card">
                    <img class="card-img-top" src="pics/post_pics/<%=p.getPic()%>" alt="Card image cap">
                    <div class="card-body">
                        <h3 class="card-title"><%=p.getPtitle()%>
                        </h3>
                        <p><%=p.getPcontent()%>
                        </p>
                    </div>
                    <div class="card-footer">

                        <%
                            user = userDao.getUserById(p.getUid());

                        %>
                        <span>
                        posted by :<img src="pics/profile_pic/<%=user.getProfile()%>"
                                        style="border-radius: 50%; width: 30px; height:30px;" alt="profile">
                        <%=user.getUsername()%>
                    </span>

                    </div>
                </div>
            </div>

                <%
            }
        }

    %>
</main>


<%@include file="components/footer.jsp" %>
<%@include file="components/bootstrap/bootstrap_JS.jsp" %>
<script>

    $(document).ready(function () {
        $(".content").hide();
        $(".show_hide").on("click", function () {
            var txt = $(".content").is(':visible') ? 'Read More' : 'Read Less';
            $(".show_hide").text(txt);
            $(this).next('.content').slideToggle(200);
        });
    });

</script>
</body>
</html>
