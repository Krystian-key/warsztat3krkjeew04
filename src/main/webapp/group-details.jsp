<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 09.04.2020
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <%@include file="header.jsp" %>
    <title>users-groups</title>
</head>
<body>
<div>
    <table class="mystyle">
        <thead>
        <tr>
            <td>Id:</td>
            <td>Username:</td>
            <td>Details:</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="grouplist" items="${requestScope.usersGroupList}" >
            <tr>
                <td>${grouplist.id}</td>
                <td>${grouplist.userName}</td>
                <td><a href="${pageContext.request.contextPath}/usersDate?id=${grouplist.id}">Details</a></td>
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
