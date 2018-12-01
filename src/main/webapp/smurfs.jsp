<%--
  Created by IntelliJ IDEA.
  User: slawek
  Date: 01.12.18
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

    <title>Smurfs</title>

</head>

<body>

<table>

    <c:forEach var="smurf" items="${smurfs}">
        <tr>
            <td>${smurf.name}</td>
            <td>${smurf.attribute}</td>
            <td>${smurf.description}</td>
        </tr>
    </c:forEach>

</table>

</body>

</html>