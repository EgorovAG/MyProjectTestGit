<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<h1><c:out value="Ваша зарплата составляет"/></h1>

<h4><c:out value="Отчисления в ФСЗН ${sum_fszn}"/></h4>
<h4><c:out value="Отчисления в Белгосстрах ${sum_bgs}"/></h4>
<h4><c:out value="Удержание подоходного налога ${sum_pdn}"/></h4>
<h4><c:out value="Отчисления в профсоюз ${sum_prfsz}"/></h4>
<h4><c:out value="Итого зарплата ${sum1}"/></h4>

<a href="${pageContext.request.contextPath}/homePage.jsp">Home</a>

</body>
</html>
