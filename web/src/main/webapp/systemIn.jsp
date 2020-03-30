<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>qwe</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/summa" method="get" >
<h1 style="text-align: center"><c:out value="Вы вошли в программу для рассчета зарплаты"/></h1>
    <input style="text-align: center" type="submit" value="Рассчитать заработную плату">    <br/>

    <a href="${pageContext.request.contextPath}/homePage.jsp">Home</a>

</form>
</body>
</html>
