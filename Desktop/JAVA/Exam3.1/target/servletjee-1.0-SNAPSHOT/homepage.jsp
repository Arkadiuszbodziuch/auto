<%--
  Created by IntelliJ IDEA.
  User: arkadiusz
  Date: 2019-04-14
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<c:choose>
    <c:when test="${not empty cookie.cookieAccept}">
        <c:out value="Ciasteczko zostalo zaakceptowane"></c:out>
    </c:when>
    <c:otherwise>
        <h4>Korzytsamy z pplików Coockies</h4>

        <a href="/homepage?cookie=yes">Zaakceptuj cookies</a>

    </c:otherwise>
</c:choose>

</body>
</html>
