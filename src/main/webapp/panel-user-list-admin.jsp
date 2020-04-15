<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 11.04.2020
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="header.jsp"%>
    <link href='<c:url value="/css/style.css"/>' rel="stylesheet" type="text/css">
    <title>Title</title>
</head>
<body>
<div>
    <table class="mystyle">
        <thead>
        <tr>
            <td>Username:</td>
            <td>email:</td>
            <td>User group:</td>
            <td><a href="${pageContext.request.contextPath}/AddUserList">Add</a></td>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="ShowUsersList" items="${requestScope.ShowUsersList}" >
            <tr>
                <td>${ShowUsersList.userName}</td>
                <td>${ShowUsersList.email}</td>
                <td>${ShowUsersList.userGroup}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/EditUserList?id=${ShowUsersList.id}">Edit</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
