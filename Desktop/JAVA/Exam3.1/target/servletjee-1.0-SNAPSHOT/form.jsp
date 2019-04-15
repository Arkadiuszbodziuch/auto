<%--
  Created by IntelliJ IDEA.
  User: roph
  Date: 07.04.2019
  Time: 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<c:url value="${urlPath}"/>" method="POST">
    <c:forEach begin="${start}" end="${end}" varStatus="status">
        <h1>SmUrFs ${status.index}</h1>
        <label>
            Name:
            <input type="text" name="${"name".concat(status.index)}">
        </label><br/>
        <label>
            Atribute:
            <input type="text" name="${"atribute".concat(status.index)}">
        </label><br/>
        <label>
            Desription:
            <input type="text" name="${"desription".concat(status.index)}">
        </label><br/>
    </c:forEach>
    <input type="submit">
</form>
</body>
</html>
