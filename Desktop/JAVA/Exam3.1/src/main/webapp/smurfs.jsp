<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: arkadiusz
  Date: 2019-04-14
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>smurfs</title>
</head>
<body>

<table border="1">
    <thead>
    <th>Name</th>
    <th>Attribute</th>
    <th>Description</th>
    </thead>
    <tbody>
    <c:forEach items="${smurfs}" var="smurf">
        <tr>
            <td>${smurf.name}</td>
            <td>${smurf.attribute}</td>
            <td>${smurf.description}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>



</body>
</html>
