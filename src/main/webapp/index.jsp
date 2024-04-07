<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Hello</title>
</head>
<body>
<h1><%= "Home page!" %></h1>
<br/>

<a href="selectAll-servlet">Показать всех</a><br>
<a href="selectAllCtg-servlet">Показать всех используя custom tag</a><br>
<a href="selectTask-servlet">Задание: Выбрать без повторений все оценки и соответствующие им записи,
  встречающиеся более одного раза</a><br>
</body>
</html>