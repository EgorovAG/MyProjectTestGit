<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



<html>
<head>
    <title>Registration</title>
</head>
<body>

<h3>Registration user</h3>
<form action="${pageContext.request.contextPath}/registration" method="post">
    <label for="login">login</label>
    <input id="login" type="text" name="login"> <br/>

    <label for="password">password</label>
    <input id="password" type="password" name="password"><br/>
    <input type="submit" value="войти">
</form>

</body>
</html>
