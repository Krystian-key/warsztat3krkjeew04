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
    <%@ include file="header.jsp" %>
    <link href='<c:url value="/css/style.css"/>' rel="stylesheet" type="text/css">
    <title>Title</title>
</head>
<body>
<div>
    <form action="${pageContext.request.contextPath}/AddUserList" method="post">
        <div>
            <label>Username</label>
            <input type="text" name="Username">
            <label>User email</label>
            <input type="text" name="email">
            <label>User groupId</label>
            <input type="text" name="userGroupId">
            <label>User password</label>
            <input type="password" name="password">
            <button type="submit">Add</button>
        </div>
    </form>
</div>
</body>
</html>
