<%--
  Created by IntelliJ IDEA.
  User: arkadiusz
  Date: 2019-04-14
  Time: 09:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/receiver" method="get">
    <label for="name">Name:</label>  <br/>
    <input id="name" type="text" name="name">  <br/>
    <label for="mail">mail:</label>  <br/>
    <input id="mail" type="text" name="mail">  <br/>
    <label for="id">id:</label>  <br/>
    <input id="id" type="number" name="id">  <br/>

    <input type="submit">

<br>

    <a href="/receiver?name=coder&mail=coder@somemail.com&id=34">Link do receiver, Zadanie 1</a>
    <br>
    <a href = /smurfs>link do smurfs, Zadanie 2</a>
    <br>
    <a href = /regex>link do smurfs, Zadanie 3</a>
    <br>
    <a href = /addquote>link do smurfs, Zadanie 4</a>
    <br>
    <a href = /homepage>link do homepage, Zadanie 5</a>

</form>
</body>
</html>
