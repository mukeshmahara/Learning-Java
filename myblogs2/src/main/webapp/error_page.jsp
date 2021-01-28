<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 1/27/2021
  Time: 3:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page isErrorPage="true" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Error!!</title>
    <%@include file="components/bootstrap/bootstrap_css.jsp"%>
    <link rel="stylesheet" href="components/custom_css/style.css">
</head>
<body>

<div class="container " >
    <a href="index.jsp" >
        <img src="img/error.png" class="image-fluid" style="width: 100%; height: 100%;" alt="Error">
    </a>
    <%=exception%>
</div>

<%@include file="components/jQuery/jquery.jsp" %>
<%--<%@include file="components/bootstrap/bootstrap_JS.jsp" %>--%>
<%@include file="components/footer.jsp" %>
</body>
</html>
