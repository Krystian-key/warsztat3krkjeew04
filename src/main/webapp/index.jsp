<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 08.04.2020
  Time: 15:38
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
    <table>
        <thead>
        <tr>
            <td>Id:</td>
            <td>Exercise:</td>
            <td>Date:</td>
            <td>Details:</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="sol" items="${requestScope.recentSolutions}">
            <tr>
                <td>${sol.usersId}</td>
                <td>${sol.exerciseId}</td>
                <td>${sol.updated}</td>
                <td>
                    <form action="${pageContext.request.contextPath}/?solutionsId=${sol.id}" method="post">
                        <button type="submit">Details</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
<footer>
    <%@ include file="footer.jsp" %>
</footer>
</html>
