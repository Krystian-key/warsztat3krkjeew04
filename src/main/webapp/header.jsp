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
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
    <link href='<c:url value="/css/style.css"/>' rel="stylesheet" type="text/css">
    <title>Title</title>
</head>
<body>
<div id='cssmenu'>
    <ul>
        <li class='active'><a href='${pageContext.request.contextPath}/'><span>Home</span></a></li>
        <li><a href='${pageContext.request.contextPath}/usersGroups'><span>Groups</span></a></li>
        <li><a href='${pageContext.request.contextPath}/panelAdmin'><span>Admin</span></a></li>
        <li class='last'><a href='#'><span>Contact</span></a></li>
    </ul>
</div>
</body>
</html>
