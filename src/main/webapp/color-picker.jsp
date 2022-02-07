<%--
  Created by IntelliJ IDEA.
  User: michaelgalimore
  Date: 2/6/22
  Time: 4:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Color Picker</title>
</head>
<body>
<form  action="/pickcolor" method="post">
<label for="color">Favorite Color</label>
<input type="text" id="color" name="color">
<input type="submit" value="Submit Color">
</form>
</body>
</html>
