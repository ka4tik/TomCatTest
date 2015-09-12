<%@ page import="in.ka4tik.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>


<%
    User user = (User) session.getAttribute("user");
%>
<h1>Login Successful</h1>
<h3>Hello <%= user.getUserName() %></h3>
</body>
</html>
