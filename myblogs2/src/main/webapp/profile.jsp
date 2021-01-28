<%@page import="com.mukeshmahara.myblogs2.entities.User" %>
<%@ page import="java.sql.Timestamp" %>
<%@page errorPage="error_page.jsp" %>
<%
    User user = (User) session.getAttribute("current_user");
    if (user == null) {
        response.sendRedirect("login_page.jsp");
    }
%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>profile</title>
    <%@include file="components/bootstrap/bootstrap_css.jsp" %>
    <link rel="stylesheet" href="components/custom_css/style.css">

</head>
<body>

<%--<%@include file="components/navbar.jsp" %>--%>


<nav class="navbar navbar-dark primary-background navbar navbar-expand-lg">
    <a class="navbar-brand" href="index.jsp">
        <span class="fa fa-envira">Explore</span>
    </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText"
            aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarText">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="index.jsp">Home</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="blogs.jsp">My Blogs</a>
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
                <a href="contact.jsp" class="nav-link"><span class="fa fa-address-card-o"></span>Contact</a>
            </li>
        </ul>


        <a href="#!" class="navbar-text nav-link fa fa-user" data-toggle="modal" data-target="#profile-modal">

            <%=user.getUsername()%>

        </a>
        <a href="Logout" class="btn btn-light">logout</a>
    </div>
</nav>

<%--End of navbar--%>
<%--Start of profile modal--%>
<!-- Modal -->
<div class="modal fade" id="profile-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog " role="document">
        <div class="modal-content text-center ">
            <div class="modal-header primary-background">
                <h5 class="modal-title " id="exampleModalLabel">Profile</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="container" id="pp-container">
                    <img src="pics/default.png" alt="Profile image" class="img-fluid"
                         style="border-radius: 50%; width:100px;height: 100px; ">
                    <h3 class="text-center mt-3"><%=user.getUsername()%>
                    </h3>

                </div>
                <%--                Edit Profile section here--%>
                <div class="container" id="profile-edit" style="display: none;">
                    <form action="Edit_User_Info" method="post" enctype="multipart/form-data">
                        <div class="container">
                            <input type="file" id="image" class="image-upload" name="user_image">

                            <img src="pics/default.png" alt="Profile image" class="img-fluid"
                                 style="border-radius: 50%; width:100px;height: 100px; ">
                            <h3 class="text-center mt-3"><%=user.getUsername()%>
                            </h3>

                        </div>
                        <table class="table text-center">
                            <tr>
                                <td>ID</td>
                                <td><%=user.getId()%>
                                </td>
                            </tr>

                            <tr>
                                <td>Email</td>
                                <td><input type="text" class="form-control" name="user_email"
                                           value=<%=user.getEmail()%>></td>
                            </tr>
                            <tr>
                                <td>Address</td>
                                <td><input type="text" class="form-control" name="user_address"
                                           value=<%=user.getAddress()%>></td>
                            </tr>


                            <tr>
                                <td>Phone number</td>
                                <td><input type="text" class="form-control" name="user_phone"
                                           value=<%=user.getPhone()%>></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td>
                                    <input type="submit" value="Save">
                                </td>
                            </tr>
                        </table>


                    </form>
                </div>

                <table class="table table-hover table-striped text-center" id="profile-details">
                    <tr>
                        <td>ID</td>
                        <td><%=user.getId()%>
                        </td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><%=user.getEmail()%>
                        </td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td><%=user.getAddress()%>
                        </td>
                    </tr>
                    <tr>
                        <td>Phone</td>
                        <td><%=user.getPhone()%>
                        </td>

                    </tr>
                    <tr>
                        <td>Registered at</td>
                        <td><%=user.getDateTime()%>
                        </td>
                    </tr>
                </table>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-light" id="edit-profile-btn">Edit</button>

            </div>
        </div>
    </div>
</div>

<%--Emd of profile modal--%>


<main class="container">
    <div class="jumbotron">
        <div class="row">
            <div class="col-md-12  d-block">

                <%=user.getUsername()
                %>
                "<br>"
                <%=user.getEmail()
                %>
                <span>

                    <div class="btn btn-primary">Set Profile</div>
                    <div class="btn btn-secondary">Chat</div>
                </span>

            </div>
            <div class="col-md-4  d-block">helllo world</div>

        </div>

    </div>

</main>


<%@include file="components/footer.jsp" %>
<%@include file="components/bootstrap/bootstrap_JS.jsp" %>


<script>

    $(document).ready(function () {
        let editStatus = false;


        $('#edit-profile-btn').click(function () {

            if (editStatus == false) {
                $('#profile-details').hide()
                $('#pp-container').hide()
                $('#profile-edit').show();
                editStatus = true
                $(this).text("Back")
            } else {
                $('#profile-details').show()
                $('#pp-container').show()
                $('#profile-edit').hide();
                editStatus = false
                $(this).text("Edit")
            }
        })
    })
</script>

</body>
</html>
