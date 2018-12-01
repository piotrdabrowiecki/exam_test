<%--
  Created by IntelliJ IDEA.
  User: slawek
  Date: 01.12.18
  Time: 19:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

    <title>Title</title>

</head>

<body>


<form action="/receiver" method="get">

    <input type="text" placeholder="name" name="name"/>
    <input type="text" placeholder="e-mail" name="mail"/>
    <input type="number" placeholder="id" name="id"/>

    <input type="submit" value="send"/>
</form>

</body>

</html>