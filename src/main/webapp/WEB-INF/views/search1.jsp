<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search By Source</title>
</head>
<body style="background-color: lightblue">
<div align="center">
	<form action="/listbysource" method="post" id="sourcelist">
		<table>
			<tr>
				<td>Name Of Source:</td>
				<td><input type="text" id="source" name="sourceName"></td>
			</tr>
		<tr>
			<td><input type="submit" id="submit" value="Search"></td>
		</tr>	
		
		<tr>
			<td><input type="button" value="Back" onclick="location.href = '/'"></td>
			</tr>
		</table>
	</form>
	
</div>
</body>
</html>