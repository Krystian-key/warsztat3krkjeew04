<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 08.04.2020
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
<ul class="nav nounderline text-uppercase">
    <li class="nav-item ml-4">
        <a class="nav-link color-header" href="${pageContext.request.contextPath}/">Home</a>
    </li>
    <li class="nav-item ml-4">
        <a class="nav-link color-header" href="${pageContext.request.contextPath}/usersGroups">Users Group</a>
    </li>
    <li class="nav-item ml-4">
        <a class="nav-link" href="about">Admin Panel</a>
    </li>
    <li class="nav-item ml-4">
        <a class="nav-link disabled" href="contact">Contact</a>
    </li>
</ul>
</p>
</body>
</html>
