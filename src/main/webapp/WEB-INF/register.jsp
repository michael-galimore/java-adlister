<%--
  Created by IntelliJ IDEA.
  User: michaelgalimore
  Date: 2/11/22
  Time: 9:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>
<h1>Create a User name and password</h1>
<form action="/register" method="post">
    <label for="register">Username</label>
    <input type="text" id="register" name="username">
    <label for="password" >Password</label>
    <input type="password" id="password" name="password">
    <label for="email">email</label>
    <input type="text" id="email" name="email">
    <input type="submit" value="Create Account">
</form>

</body>
</html>
