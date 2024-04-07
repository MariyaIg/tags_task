<%@ page import="com.ignateva.tags_task.entity.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Мария
  Date: 07.04.2024
  Time: 8:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="ctg" uri="customtags" %>
<html>
<link rel="stylesheet" href="style.css">
<head>
    <title>using Ctg</title>
</head>
<body>

<%List<Student> students = (List)request.getAttribute("students");%>
<ctg:Student-table rows="<%=students.size()%>" head="Students">
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
