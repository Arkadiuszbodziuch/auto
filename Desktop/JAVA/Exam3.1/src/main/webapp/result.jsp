<%--
  Created by IntelliJ IDEA.
  User: arkadiusz
  Date: 2019-04-14
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            border-collapse: collapse;
        }
        table, th, td {
            border: 2px solid red;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <th>name</th>
        <th>atribute</th>
        <th>description</th>
    </tr>

    <c:forEach items="${smurf}" var="smurf" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${smurfs.name}</td>
            <td>${smurfs.atribute}</td>
            <td>${smurfs.desription}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>