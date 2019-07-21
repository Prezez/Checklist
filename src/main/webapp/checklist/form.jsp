<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.format.DateTimeFormatter" %><%--
  Created by IntelliJ IDEA.
  User: D
  Date: 2019-07-21
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Item To Checklist</title>
</head>
<body>
<jsp:include page="/header.jsp"></jsp:include>

<form action="checklist/add" method="post">
    <input type="text" name="name"> <br>
    <input type="date" value="<%=LocalDate.now()%>" name="date_created" readonly> <br>
    <input type="date" name="date_completed"> <br>
    <input type="checkbox" name="archived"> <br>
    <input type="submit">


</form>
</body>
</html>
