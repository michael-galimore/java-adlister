<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: michaelgalimore
  Date: 2/6/22
  Time: 5:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Results</title>
</head>
<body>
<c:choose>
    <c:when test="${result}">
        <h1>You guessed right!</h1>

    </c:when>
    <c:otherwise>
        <h1>Not This Time</h1>

    </c:otherwise>
</c:choose>
<a href="/guess">Feeling Lucky?</a>
</body>
</html>
