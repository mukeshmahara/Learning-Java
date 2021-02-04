<%@ page import="com.mukeshmahara.myblogs2.entities.Message" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <%@include file="components/bootstrap/bootstrap_css.jsp" %>
    <link rel="stylesheet" href="components/custom_css/style.css">

</head>

<body>

<main>
    <%@include file="components/navbar.jsp" %>

    <div class="container ">
        <div class="card bg-light registration">
            <article class="card-body mx-auto" style="max-width: 400px;">
                <h4 class="card-title mt-3 text-center">Create Account</h4>
                <p class="text-center">Get started with your free account</p>
                <p>
                    <a href="" class="btn btn-block btn-twitter"> <i class="fab fa-twitter"></i>   Login via Twitter</a>
                    <a href="" class="btn btn-block btn-facebook"> <i class="fab fa-facebook-f"></i>   Login via
                        facebook</a>
                </p>
                <p class="divider-text">
                    <span class="bg-light">OR</span>
                </p>
                <%--            Alert message for error input right here--%>
                    <%
                        Message m = (Message)session.getAttribute("regFail");
                        if (m!=null){%>

                <div class=<%=m.getCssClass() %> role="alert">
                    <%=m.getContent()%>
                </div>
                    <%}
                        session.removeAttribute("regFail");

                %>

                <form action="Register" method="post">
                    <div class="form-group input-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text"> <i class="fa fa-user"></i> </span>
                        </div>
                        <input name="username" class="form-control" placeholder="Full name" type="text">
                    </div> <!-- form-group// -->
                    <div class="form-group input-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text"> <i class="fa fa-envelope"></i> </span>
                        </div>
                        <input name="email" class="form-control" placeholder="Email address" type="email">
                    </div> <!-- form-group// -->


                    <div class="form-group input-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text"> <i class="fa fa-address"></i> </span>
                        </div>
                        <input name="address" class="form-control" placeholder="Full Address" type="text">
                    </div> <!-- form-group// -->

                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text">Upload</span>
                        </div>
                        <div class="custom-file">
                            <input type="file" name="profile-pic" class="custom-file-input" id="inputGroupFile01">
                            <label class="custom-file-label" for="inputGroupFile01"> profile image</label>
                        </div>
                    </div>

                    <div class="form-group input-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text"> <i class="fa fa-phone"></i> </span>
                        </div>
                        <select class="custom-select" style="max-width: 80px;">
                            <option selected="">+977</option>
                            <option value="1">+972</option>
                            <option value="2">+198</option>
                            <option value="3">+701</option>
                        </select>

                        <input name="phone" class="form-control" placeholder="Phone number" type="text">

                    </div> <!-- form-group// -->
                    <div class="form-check">
                       <span class="">
                            <input type="radio" value="male" name="gender" id="male">
                        <label class="form-check-label" for="male">
                            Male
                        </label>
                        <input type="radio" value="female" name="gender" id="female">
                        <label class="form-check-label" for="female">
                            Female
                        </label>
                       </span>
                    </div>

                    <div class="form-group input-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text"> <i class="fa fa-lock"></i> </span>
                        </div>
                        <input class="form-control" placeholder="Create password" type="password" name="password">
                    </div> <!-- form-group// -->
                    <div class="form-group input-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text"> <i class="fa fa-lock"></i> </span>
                        </div>
                        <input class="form-control" placeholder="Repeat password" type="password" name="password">
                    </div> <!-- form-group// -->


                    <%

                    %>


                    <div class="form-group">
                        <small class="ml-4">
                            <input type="checkbox" name="check" class="ml-4"> Accept all terms and conditions
                        </small>


                    </div>

                    <div class="form-group">
                        <input type="submit" class="btn btn-primary btn-block" value=" Create Account"></input>
                    </div> <!-- form-group// -->
                    <p class="text-center">Have an account? <a class="link-item" href="login_page">Log In</a></p>

                </form>


        </div>

        </article>
    </div> <!-- card.// -->

    </div>

</main>


<%@include file="components/bootstrap/bootstrap_JS.jsp" %>


<%@include file="components/footer.jsp" %>
</body>
</html>
