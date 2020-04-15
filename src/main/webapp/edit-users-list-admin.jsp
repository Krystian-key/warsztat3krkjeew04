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
    <form action="${pageContext.request.contextPath}/EditUserList?id=${requestScope.user.id}" method="post">
    <div>
        <label>user GroupId</label>
        <input type="text" name="groupId" value="${requestScope.user.userGroupId}">
        <label>Username</label>
        <input type="text" name="userName" value="${requestScope.user.userName}">
        <label>User email</label>
        <input type="text" name="email" value="${requestScope.user.email}">
        <button type="submit">Edit</button>
    </div>
    </form>
</div>
</body>
</html>
