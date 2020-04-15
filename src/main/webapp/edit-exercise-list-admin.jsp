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
    <form action="${pageContext.request.contextPath}/EditExerciseList?id=${requestScope.usersExercise.id}" method="post">
    <div>
        <label>Exercise title</label>
        <input type="text" name="exerciseName" value="${requestScope.usersExercise.title}">
        <label>Exercise description</label>
        <input type="text" name="exerciseDesc" value="${requestScope.usersExercise.description}">
        <button type="submit">Edit</button>
    </div>
    </form>
</div>
</body>
</html>
