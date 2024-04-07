<%@ page import="java.util.List" %>
<%@ page import="com.ignateva.tags_task.entity.Student" %>

<%@ taglib prefix="ctg" uri="customtags" %>
<%--
  Created by IntelliJ IDEA.
  User: Мария
  Date: 06.04.2024
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="style.css">
<head>
    <title>List of Students</title>
</head>
<body>
<h4>весь список </h4>
<table class="example">
    <tr>
        <td>Номер</td>
        <td>Фамилия</td>
        <td>Имя</td>
        <td>Балл</td>
    </tr>
<%List<Student> students = (List)request.getAttribute("students");%>
<%
    for (Student student: students)
    {
    %>
            <tr>
            <td><%=student.getId()%></td>
            <td><%=student.getF_name()%></td>
            <td><%=student.getL_name()%></td>
            <td><%=student.getScore()%></td>
        </tr>
        <%}%>
    </table>

</body>
</html>
