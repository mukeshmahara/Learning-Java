<%@ page import="com.mukeshmahara.myblogs2.entities.User" %>
<%

    if ((User) session.getAttribute("current_user") == null) {
%>

<nav class="navbar navbar-dark text-light primary-background navbar navbar-expand-lg">
    <a class="navbar-brand" href="index">
        <span class="fa fa-envira">Explore</span>
    </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText"
            aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarText">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="index">Home</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="post">Blogs</a>
            </li>
            <li class="nav-item dropdown active">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
                   aria-haspopup="true" aria-expanded="false">
                    <span class="fa fa-check-square-o"></span>Categories
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Sports</a>
                    <a class="dropdown-item" href="#">Hiking</a>
                    <a class="dropdown-item" href="#">Museum and Park</a>
                    <a class="dropdown-item" href="#">Mountain and Snow</a>
                </div>
            </li>
            <li class="nav-item active">
                <a href="contact" class="nav-link"><span class="fa fa-address-card-o"></span>Contact</a>
            </li>
            <li class="nav-item active">
                <a href="login_page" class="nav-link"><i class="fa fa-sign-in mr-2"></i>Sign in</a>
            </li>
        </ul>

        <a href="profile" class="navbar-text"></a>


    </div>
    <form class="form-inline">
        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
</nav>

<%
} else {
%>

<nav class="navbar navbar-dark text-light primary-background navbar navbar-expand-lg">
    <a class="navbar-brand" href="index">
        <span class="fa fa-envira"> Explore </span>
    </a>
    <button class="navbar-toggler" type="button" data - toggle="collapse" data - target="#navbarText"
            aria - controls="navbarText" aria - expanded="false" aria - label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="loginStatus">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="index"> Home </a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="post"> My Blogs</a>
            </li>
            <li class="nav-item dropdown active">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown1" role="button"
                   data - toggle="dropdown"
                   aria - haspopup="true" aria - expanded="false">
                    <span class="fa fa-check-square-o"></span> Categories
                </a>
                <div class="dropdown-menu" aria - labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#"> Sports </a>
                    <a class="dropdown-item" href="#"> Hiking </a>
                    <a class="dropdown-item" href="#"> Museum and Park</a>
                    <a class="dropdown-item" href="#"> Mountain and Snow</a>
                </div>
            </li>
            <li class="nav-item active">
                <a href="contact" class="nav-link"><span class="fa fa-address-card-o"></span> Contact </a>
            </li>

        </ul>

        <a href="profile" class="navbar-text"><%
            User u = (User) session.getAttribute("current_user");
        %>
            <span class="margin-right  nav-item active">

                <a href="#!" class="nav-item active"><i class="fa fa-upload text-light ml-2">upload</i></a>
            <img src="pics/profile_pic/<%=u.getProfile()%>" class="ml-2" style="height: 25px; width: 25px; border-radius: 50%;"
                 alt="pp">

            <%=u.getUsername()%>
                <a href="Logout" class="btn btn-light ml-2">logout</a>
            </span>
        </a>
    </div>
</nav>
<%
    }
%>