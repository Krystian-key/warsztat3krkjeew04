<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Programming school</title>
</head>
<body>
<p>Solutions:</p>
<c:forEach var="sol" items="${solutions}">
    <a href="#">${sol.description}</a>
</c:forEach>
</body>
</html>