<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
$(document).ready(function()
		{
$("#download").click(function (e) {
	alert("xxx");
	window.open('data:application/vnd.ms-excel,' + encodeURIComponent($('#display').html()));     e.preventDefault(); });
		});
</script>
<title>List of All Travellers</title>
</head>
<body style="background-color: lightblue">
	<div align="center" id="display">
		<h1>LIST OF ALL TRAVELLERS</h1>
		<hr>
		<table>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>TRAVEL DATE</th>
				<th>BOOKING DATE</th>
				<th>PRICE</th>
				<th>SOURCE</th>
				<th>DESTINATION</th>
			</tr>
			<tbody>
				<c:forEach items="${listAll}" var="bookingDetails">
					<tr>
						<td>${bookingDetails.id}</td>
						<td>${bookingDetails.travellerName}</td>
						<td>${bookingDetails.dateOfTravel}</td>
						<td>${bookingDetails.dateOfBooking}</td>
						<td>${bookingDetails.price}</td>
						<td>${bookingDetails.source}</td>
						<td>${bookingDetails.destination}</td>
						<td><input type="button"
							onclick="location.href='/delete/${bookingDetails.id}'"
							value="Delete"></td>
					</tr>
				</c:forEach>
			</tbody>

			<tr>
				<td><input type="submit" value="Back"
					onclick="location.href = '/';"></td>
			</tr>
		</table>
	</div>
	<input type="submit" id="download" value="Download">
</body>
</html>