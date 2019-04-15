<%--
  Created by IntelliJ IDEA.
  User: arkadiusz
  Date: 2019-04-14
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1">
    <thead>
    <th>Author</th>
    <th>Content</th>
    </thead>
    <tbody>
    <c:forEach items="${quotes}" var="quote">
        <tr>
            <td>${quote.author}</td>
            <td>${quote.content}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
