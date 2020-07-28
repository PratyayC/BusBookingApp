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
	<form action="/listbydestination" method="post" id="destinationlist">
		<table>
			<tr>
			<td>Name Of Destination:</td>
				<td><input type="text" id="destination" name="destinationName"></td>
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