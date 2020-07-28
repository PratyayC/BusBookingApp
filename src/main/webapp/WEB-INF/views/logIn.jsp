<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: lightblue">
<div align="center">
<h1>LOG IN</h1>
<hr>
<form action="/loggingIn" method="post" modelAttribute=login>
User ID:
<input type="text" name="id"><br> <br>
Password:
<input type="text" name="password"><br> <br>
<input type="submit" value="submit">
</form>
</div>
</body>
</html>