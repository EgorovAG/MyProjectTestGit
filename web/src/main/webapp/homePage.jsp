<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<h1 style="text-align: center"><c:out value="Home page" /> </h1>

<form action="${pageContext.request.contextPath}/login.jsp">
    <h4><c:out value="Войти"/></h4>
    <input type="submit" value="Войти">
</form>

<form action="${pageContext.request.contextPath}/registration.jsp">
    <h4><c:out value="Регистрация"/></h4>
    <input type="submit" value="Регистрация">
</form>


</body>
</html>
