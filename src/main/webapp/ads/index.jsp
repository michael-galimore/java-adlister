<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: michaelgalimore
  Date: 2/7/22
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADS</title>
</head>
<body>

<h1 >All Ads</h1>

<c:forEach var="ad" items="${ads}">

<div class="ad">
    <h2>Title: ${ad.title}</h2>
    <p>Description: ${ad.description}</p>


</div>
</c:forEach>
</body>
</html>
