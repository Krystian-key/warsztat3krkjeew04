<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 11.04.2020
  Time: 18:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%@include file="header.jsp" %>
    <title>Title</title>
</head>
<body>
<div>
    <table class="mystyle">
        <thead>
        <tr>
            <td>Id:</td>
            <td>Created:</td>
            <td>Updated:</td>
            <td>Description:</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="userSolutions" items="${requestScope.GroupsDeatials}" >
            <tr>
                <td>${userSolutions.id}</td>
                <td>${userSolutions.created}</td>
                <td>${userSolutions.updated}</td>
                <td>${userSolutions.description}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
<footer>
    <%@include file="footer.jsp" %>
</footer>
</html>
