<%@ page import="com.ignateva.tags_task.entity.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Мария
  Date: 07.04.2024
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="ctg" uri="customtags" %>
<html>
<link rel="stylesheet" href="style.css">
<head>
    <title>Студенты, получившие баллы, встречающиеся более 1 раза</title>
</head>
<body>
<%List<Student> students = (List)request.getAttribute("students");%>
<ctg:Student-table rows="<%=students.size()%>" head="Студенты, получившие баллы, встречающиеся более 1 раза">
    <%for (Student student: students)
    {%>
    <tr>
        <td><%=student.getId()%></td>
        <td><%=student.getF_name()%></td>
        <td><%=student.getL_name()%></td>
        <td><%=student.getScore()%></td>
    </tr>
    <%}%>
</ctg:Student-table>
</body>
</html>
