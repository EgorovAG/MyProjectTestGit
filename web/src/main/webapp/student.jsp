<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



<a href="${pageContext.request.contextPath}/logout">logout</a>
<h3>Cтуденты</h3>
<c:if test="${students != null}">
    <table>
        <tr>
            <th>Имя</th>
            <th>phone</th>
            <th>email</th>
        </tr>
        <c:forEach items="${students}" var="student">
            <tr>
                <td>${student.name}</td>
                <td>${student.phone}</td>
                <td>${student.email}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>


<c:if test="${authUser != null}">
    <h3>Добавить студента</h3>
    <form action="${pageContext.request.contextPath}/student" method="post">
        <label for="name">имя</label>
        <input id="name" type="text" name="name"><br/>

        <label for="email">email</label>
        <input id="email" type="text" name="email"><br/>

        <label for="phone">phone</label>
        <input id="phone" type="text" name="phone"><br/>

        <input type="submit">
    </form>
</c:if>



<%= request.getAttribute("students")%>

