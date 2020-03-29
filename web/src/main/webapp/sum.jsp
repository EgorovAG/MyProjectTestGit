<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Введите сумму заработной платы без учета налогов </h3>
<form action="${pageContext.request.contextPath}/summa" method="post" >

    <label for="sum"> summa</label> <br/>
    <input id="sum" type="text" name="sum"> <br/> <br/>

    <label for="fszn"> fszn (34%+1%)</label> <br/>
    <input id="fszn" type="text" name="fszn"> <br/> <br/>

    <label for="bgs"> bgs(0.6%)</label> <br/>
    <input id="bgs" type="text" name="bgs"> <br/> <br/>

    <label for="pdn"> pdn(13%)</label> <br/>
    <input id="pdn" type="text" name="pdn"> <br/> <br/>

    <label for="prfsz"> prfsz(1%)</label> <br/>
    <input id="prfsz" type="text" name="prfsz"> <br/> <br/>



    <input type="submit" value="войти">
</form>



</body>
</html>
