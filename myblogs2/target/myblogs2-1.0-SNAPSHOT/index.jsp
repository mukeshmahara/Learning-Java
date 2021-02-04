<%@page errorPage="error_page.jsp" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    User user = (User) session.getAttribute("current_user");
    if (user == null) {
%>

<!DOCTYPE html>
<html>
<head>

    <%@include file="components/bootstrap/bootstrap_css.jsp" %>
    <link rel="stylesheet" href="components/custom_css/style.css">

    <title>Home</title>
</head>
<body>

<div id="fb-root"></div>
<script async defer crossorigin="anonymous"
        src="https://connect.facebook.net/en_US/sdk.js#xfbml=1&version=v9.0&appId=427091452041039&autoLogAppEvents=1"
        nonce="YWgrlR7V"></script>
<%@include file="components/navbar.jsp" %>

<%--//Creating banner--%>

<div class="container-fluid m-0 p-0 banner-background position-relative">

    <div class="jumbotron primary-background text-light ">
        <div class="container ">

            <h1 class="display-3">Beginner's Java</h1>
            <p>We help you to learn Java from basic to Advance...</p>
            <p>Java is a general purpose programming language, much like Python or JavaScript. The language itself is
                specifically an object oriented programming language, so bears similarities to C++, C#. Java is also a
                platform, which means that Java code can run on any machine that has a Java Virtual Machine (JVM) on
                it</p>

            <a href="register_page" class="btn btn-outline-light btn-lg"><span class="fa fa-spinner"></span>Start!
                It's
                free...
            </a>

            <a href="register_page" class="btn btn-outline-light btn-lg"><span class="fa fa-user-circle "></span>&nbsp;sign
                up</a>


        </div>
    </div>

</div>


<div class="container">
    <hr>
    <div class="row">
        <div class="col md-4">
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <h6 class="card-subtitle mb-2 text-muted">Card subtitle</h6>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                        card's
                        content.</p>
                    <a href="#" class="card-link">Card link</a>
                    <a href="#" class="card-link">Another link</a>
                </div>
            </div>
        </div>
        <div class="col md-4">
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <h6 class="card-subtitle mb-2 text-muted">Card subtitle</h6>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                        card's
                        content.</p>
                    <a href="#" class="card-link">Card link</a>
                    <a href="#" class="card-link">Another link</a>
                </div>
                <div class="fb-comments" data-href="http://localhost:8080/myblogs2/index" data-width="300px"
                     data-numposts="5"></div>

            </div>
        </div>
        <div class="col md-4">
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <h6 class="card-subtitle mb-2 text-muted">Card subtitle</h6>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                        card's
                        content.</p>
                    <a href="#" class="card-link">Card link</a>
                    <a href="#" class="card-link">Another link</a>
                </div>
            </div>
        </div>

    </div>
    <hr>
    <div class="row">
        <div class="col md-4">
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <h6 class="card-subtitle mb-2 text-muted">Card subtitle</h6>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                        card's
                        content.</p>
                    <a href="#" class="card-link">Card link</a>
                    <a href="#" class="card-link">Another link</a>
                </div>
            </div>
        </div>
        <div class="col md-4">
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <h6 class="card-subtitle mb-2 text-muted">Card subtitle</h6>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                        card's
                        content.</p>
                    <a href="#" class="card-link">Card link</a>
                    <a href="#" class="card-link">Another link</a>
                </div>
            </div>
        </div>
        <div class="col md-4">
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <h6 class="card-subtitle mb-2 text-muted">Card subtitle</h6>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                        card's
                        content.</p>
                    <a href="#" class="card-link">Card link</a>
                    <a href="#" class="card-link">Another link</a>
                </div>
            </div>
        </div>

    </div>
    <hr>
</div>
<%@include file="components/footer.jsp" %>
<%@include file="components/jQuery/jquery.jsp" %>
</body>


</html>

<%

} else {
%>

<!DOCTYPE html>
<html>
<head>

    <%@include file="components/bootstrap/bootstrap_css.jsp" %>
    <link rel="stylesheet" href="components/custom_css/style.css">

    <title>Home</title>
</head>
<body>
<%@include file="components/navbar.jsp" %>

<%--//Creating banner--%>

<div class="container-fluid m-0 p-0 banner-background position-relative">

    <div class="jumbotron primary-background text-light ">
        <div class="container ">

            <h1 class="display-3">Beginner's Java</h1>
            <p>We help you to learn Java from basic to Advance...</p>
            <p>Java is a general purpose programming language, much like Python or JavaScript. The language itself is
                specifically an object oriented programming language, so bears similarities to C++, C#. Java is also a
                platform, which means that Java code can run on any machine that has a Java Virtual Machine (JVM) on
                it</p>
            </a>
            <span class="display-4 p-3"> &nbsp;Welcome! <%=user.getUsername()%></span>
        </div>
    </div>

</div>


<div class="container">
    <hr>
    <div class="row">
        <div class="col md-4">
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <h6 class="card-subtitle mb-2 text-muted">Card subtitle</h6>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                        card's
                        content.</p>
                    <a href="#" class="card-link">Card link</a>
                    <a href="#" class="card-link">Another link</a>
                </div>
            </div>
        </div>
        <div class="col md-4">
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <h6 class="card-subtitle mb-2 text-muted">Card subtitle</h6>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                        card's
                        content.</p>
                    <a href="#" class="card-link">Card link</a>
                    <a href="#" class="card-link">Another link</a>
                </div>
            </div>
        </div>
        <div class="col md-4">
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <h6 class="card-subtitle mb-2 text-muted">Card subtitle</h6>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                        card's
                        content.</p>
                    <a href="#" class="card-link">Card link</a>
                    <a href="#" class="card-link">Another link</a>
                </div>
            </div>
        </div>

    </div>
    <hr>
    <div class="row">
        <div class="col md-4">
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <h6 class="card-subtitle mb-2 text-muted">Card subtitle</h6>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                        card's
                        content.</p>
                    <a href="#" class="card-link">Card link</a>
                    <a href="#" class="card-link">Another link</a>
                </div>
            </div>
        </div>
        <div class="col md-4">
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <h6 class="card-subtitle mb-2 text-muted">Card subtitle</h6>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                        card's
                        content.</p>
                    <a href="#" class="card-link">Card link</a>
                    <a href="#" class="card-link">Another link</a>
                </div>
            </div>
        </div>
        <%--        <div class="col md-4">--%>
        <%--            <div class="card" style="width: 18rem;">--%>
        <%--                <div class="card-body">--%>
        <%--                    <h5 class="card-title">Card title</h5>--%>
        <%--                    <h6 class="card-subtitle mb-2 text-muted">Card subtitle</h6>--%>
        <%--                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the--%>
        <%--                        card's--%>
        <%--                        content.</p>--%>
        <%--                    <a href="#" class="card-link">Card link</a>--%>
        <%--                    <a href="#" class="card-link">Another link</a>--%>
        <%--                </div>--%>
        <%--            </div>--%>
        <%--        </div>--%>

        <%--    </div>--%>
        <%--    <hr>--%>
    </div>
</div>

<%@include file="components/footer.jsp" %>
<%@include file="components/bootstrap/bootstrap_JS.jsp" %>
<%--    <%@include file="components/jQuery/jquery.jsp" %>--%>
</body>
</html>
<%
    }
%>
