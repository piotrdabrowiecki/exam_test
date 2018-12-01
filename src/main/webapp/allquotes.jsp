<%--
  Created by IntelliJ IDEA.
  User: slawek
  Date: 01.12.18
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>


    <title>allquotes</title>


</head>

<body>

<table>
    <c:forEach var="quote" items="${quotes}">
        <tr>
            <td>${quote.author}</td><td>${quote.content}</td>
        </tr>
    </c:forEach>
</table>




</body>

</html>
