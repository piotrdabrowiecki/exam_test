<%--
  Created by IntelliJ IDEA.
  User: slawek
  Date: 01.12.18
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>


    <title>addquote</title>
</head>

<body>

<form action="/addquote" method="post">
    <input type="text" placeholder="author" name="author"/>
    <input type="textarea" placeholder="quote" name="content"/>
    <input type="submit" value="send"/>
</form>


</body>



</html>
