<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:setLocale value= "en_Us"/>
<fmt:setBundle basename="translations" var="messages"/>



<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Введите данные для входа в систему</h3>
<form action="${pageContext.request.contextPath}/login" method="post">

    <label for="login"> <fmt:message key="login.username" bundle="${messages}"/> </label>
    <input id="login" type="text" name="login"> <br/>
<%--    <label for="login">login</label>--%>
<%--    <input id="login" type="text" name="login"> <br/>--%>

    <label for="password"> <fmt:message key="login.password" bundle="${messages}"/> </label>
    <input id="password" type="password" name="password"><br/>
<%--    <label for="password">password</label>--%>
<%--    <input id="password" type="password" name="password"><br/>--%>

    <input type="submit" value="войти">
</form>

<a href="${pageContext.request.contextPath}/registration.jsp">РЕГИСТРАЦИЯ</a>

<p style="color: red">${error}</p>

</body>
</html>
