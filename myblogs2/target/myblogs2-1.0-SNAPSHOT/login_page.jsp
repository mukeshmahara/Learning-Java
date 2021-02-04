<%@ page import="com.mukeshmahara.myblogs2.entities.Message" %>

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
                        <a href="register_page" class="btn btn-outline-secondary">Sign up</a>
                    </form>

                    <%
                        Message invalid_credentials_msg = (Message) session.getAttribute("Invalid_credentials_msg");
                        if (invalid_credentials_msg != null) {
                    %>

                    <div class="alert <%=invalid_credentials_msg.getCssClass()%>" role="alert">
                        <%=invalid_credentials_msg.getContent()%>

                    </div>
                    <%
                            session.removeAttribute("Invalid_credentials_msg");
                        }
                    %>

                    <%
                        Message reg_msg = (Message) session.getAttribute("reg");
                        if (reg_msg != null) {%>
                    <div class="alert <%=reg_msg.getCssClass()%>" role="alert">
                        <%=reg_msg.getContent()%>
                    </div>
                    <%
                            session.removeAttribute("reg");
                        }%>


                    <%
                        Message logout_Msg = (Message) session.getAttribute("logout_msg");
                        if (logout_Msg != null) {
                    %>
                    <div class=<%=logout_Msg.getCssClass()%> role="alert">
                        <%=logout_Msg.getContent()%>
                    </div>
                    <%

                            session.removeAttribute("logout_msg");

                        }%>


                </div>

            </div>
        </div>
    </div>
</div>

<%@include file="components/footer.jsp" %>
<%@include file="components/bootstrap/bootstrap_JS.jsp" %>


</body>
</html>
