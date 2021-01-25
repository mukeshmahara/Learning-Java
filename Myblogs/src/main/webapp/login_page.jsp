<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 1/23/2021
  Time: 5:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <link rel="stylesheet" href="./css/style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


    <title>User login</title>
    <link rel="stylesheet" href="./css/style.css">
    <style>
        @keyframes login-style {
            /*from{background-color: #42a5f5;*/
            /*}to{background-color: red;}*/
            0%   {background: red; left: 0px; top: 0px;}
            25%  {background: yellow; left: 200px; top: 0px;}
            50%  {background: #42a5f5; left: 200px; top: 200px;}
            75%  {background: green; left: 0px; top: 200px;}
            100% {background: olive; left: 0px; top: 0px;}

        }

        body{

            animation-fill-mode: forwards;
            animation-name: login-style;
            animation-duration: 6s;
            animation-iteration-count: infinite;
            animation-direction: alternate-reverse;
            animation-timing-function: ease-in-out;
        }
        .login-card {
            box-shadow: 0 5px 0 #006599;
            clip-path: polygon(0% 15%, 26% 26%, 15% 0%, 85% 0%, 73% 24%, 100% 15%, 100% 85%, 75% 68%, 85% 100%, 15% 100%, 27% 69%, 0% 85%);
            box-shadow: azure;


        }
    </style>
</head>
<body>
<%@include file="navbar.jsp" %>
<main class="primary-background login-card  container-fluid p-4">
    <div class="container p-4">
        <div class="row  ">
            <div class="col-lg-4 col-md-8 col-sm-6  offset-lg-4 offset-md- offset-sm-3">
                <div class="card shadow-lg p-3 mb-5 bg-white rounded">
                    <div class="card-header primary-background text-center">
                        <span class="fa fa-user-circle-o fa-4x" ></span>
                    </div>
                    <div class="card-body">

                        <form method="post" action="Myblogs/Login">
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
                    </div>
                </div>

            </div>
        </div>
    </div>
</main>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
<%--<script src="https://kit.fontawesome.com/a076d05399.js"></script>--%>

</body>
</html>
