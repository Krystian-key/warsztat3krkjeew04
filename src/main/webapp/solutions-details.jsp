<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 09.04.2020
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="header.jsp"%>
    <title>solutionsDetails</title>
</head>
<body>
<div>
    <table>
        <thead>
        <tr>
            <td>Author:</td>
            <td>Created:</td>
            <td>Details:</td>
        </tr>
        </thead>
        <tbody>
            <tr>
                <td>${requestScope.solutionDetails.id}</td>
                <td>${requestScope.solutionDetails.created}</td>
                <td>${requestScope.solutionDetails.description}</td>
            </tr>
        </tbody>
    </table>
</div>
</body>
<footer>
    <%@include file="footer.jsp"%>
</footer>
</html>
