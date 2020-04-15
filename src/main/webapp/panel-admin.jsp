<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 11.04.2020
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <title>Title</title>
</head>
<%@include file="header.jsp" %>
<body>
<div>
    <table class="mystyle">
        <thead>
        </thead>
        <tbody>
        <p>
        <ul class="nav nounderline text-uppercase">
            <li class="nav-item ml-4">
                <a class="nav-link color-header" href="${pageContext.request.contextPath}/ShowExerciseList">Exercise list:</a>
            </li>
            <li class="nav-item ml-4">
                <a class="nav-link color-header" href="${pageContext.request.contextPath}/ShowGroupList">Users group list:</a>
            </li>
            <li class="nav-item ml-4">
                <a class="nav-link color-header" href="${pageContext.request.contextPath}/ShowUsersList">Users list:</a>
            </li>
        </ul>
        </p>
        </tbody>
    </table>
</div>
</body>
<footer>
    <%@include file="footer.jsp" %>
</footer>
</html>
