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
            <td>Id:</td>
            <td>Title:</td>
            <td>Description:</td>
            <td>Edit:</td>
            <td>Add:</td>
            <td>Delete:</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="exercisesList" items="${requestScope.exercisesList}" >
            <tr>
                <td>${exercisesList.id}</td>
                <td>${exercisesList.title}</td>
                <td>${exercisesList.description}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/EditGroupList?id=${adminUsersGroup.id}">Edit</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
