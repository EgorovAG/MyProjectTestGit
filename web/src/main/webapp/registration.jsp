<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
    <title>Registration</title>
</head>
<body>

<h3>Регистрация пользователя</h3>
<form action="${pageContext.request.contextPath}/registration" method="post">
    <label for="login">login</label>
    <input id="login" type="text" name="login"> <br/>

    <label for="password">password</label>
    <input id="password" type="password" name="password"><br/>

    <input type="submit" value="войти">
</form>

<p style="color: red">${error}</p>
<a href="${pageContext.request.contextPath}/homePage.jsp">Home</a>

</body>
</html>
