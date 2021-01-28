<%@ page import="java.sql.Connection" %>
<%@ page import="com.mukeshmahara.myblogs2.helper.ConnectionProvider" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="com.mukeshmahara.myblogs2.entities.Message" %><%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 1/23/2021
  Time: 5:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

    <title>User login</title>

    <%@include file="components/bootstrap/bootstrap_css.jsp" %>
    <link rel="stylesheet" href="components/custom_css/style.css">

</head>
<body>
<%@include file="components/navbar.jsp" %>
<div class="container-fluid p-4">

    <div class="row ">
        <div class="col-lg-4 col-md-8 col-sm-6  offset-lg-4 offset-md- offset-sm-3">
            <div class="card shadow-lg p-3 mb-5 bg-white rounded">
                <div class="card-header primary-background text-center">
                    <span class="fa fa-user-circle-o fa-4x"></span>
                </div>
                <div class="card-body">

                    <form method="post" action="Login">
                        <div class="form-group">
                            <label for="exampleInputEmail1">Email address</label>
                            <input type="email" name="email" class="form-control" id="exampleInputEmail1"
                                   aria-describedby="emailHelp" placeholder="Enter email">

                        </div>

                        <div class="form-group">
                            <label for="exampleInputPassword1">Password</label>
                            <input type="password" name="password" class="form-control" id="exampleInputPassword1"
                                   placeholder="Password">
                        </div>
                        <div class="form-check">
                            <input type="checkbox" class="form-check-input" id="exampleCheck1">
                            <label class="form-check-label" for="exampleCheck1">Remember me</label>
                        </div>
                        <button type="submit" class="btn btn-outline-success">Login</button>
                        <a href="register_page.jsp" class="btn btn-outline-secondary">Sign up</a>
                    </form>

                    <%
                        Message m = (Message) session.getAttribute("msg");
                        if (m!=null){
                            %>

                    <div class="alert <%=m.getCssClass()%>" role="alert">
                        <%=m.getContent()%>

                    </div>
                    <%
                            session.removeAttribute("msg");
                        }
                    %>

<%--                    --%>
<%--                    <div>--%>
<%--                        <%--%>
<%--                            Connection con = ConnectionProvider.getCon();--%>
<%--                            String sql = "select * from user ";--%>

<%--                            Statement stmt = con.createStatement();--%>
<%--                            ResultSet rs = stmt.executeQuery(sql);--%>

<%--                            while (rs.next()) {--%>
<%--                                try {--%>
<%--                                    if (rs.getString("username").--%>
<%--                                            equalsIgnoreCase(request.getParameter("username"))--%>
<%--                                            &&--%>
<%--                                            rs.getString("password").--%>
<%--                                                    equalsIgnoreCase(request.getParameter("password"))) {--%>
<%--                                    } else {--%>
<%--//                                            response.sendRedirect("login_page.jsp");--%>
<%--                                        out.println("<p class=\"d-none\">" + "Invalid Credentials" + "</p>");--%>

<%--                                    }--%>
<%--                                } catch (SQLException throwables) {--%>
<%--                                    throwables.printStackTrace();--%>
<%--                                }--%>

<%--                            }--%>

<%--                        %>--%>
<%--                    </div>--%>
                </div>

            </div>
        </div>
    </div>

<%@include file="components/jQuery/jquery.jsp" %>
<%--<%@include file="components/bootstrap/bootstrap_JS.jsp" %>--%>
<%@include file="components/footer.jsp" %>
</body>
</html>
