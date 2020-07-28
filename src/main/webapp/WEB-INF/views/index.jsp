<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>


 <link href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.1/themes/base/jquery-ui.css" rel="stylesheet" />
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.1/jquery-ui.min.js"></script>

<script src="js/validation.js"></script>
<meta charset="ISO-8859-1">
<title>Travel Bus</title>
</head>
<body style="background-color: lightblue">

	<div align="center" style="height: 480px">
		<div class="header"
			style="background-color: lightgreen; text-align: center; height:40px" >
			<h1>
				<img src="images/bus2.png"
					style="float:left; margin-left: 25px; width:70px; height:40px">TRAVELBUS
			</h1>
		</div>
		<nav
			style="float: left; width: 200px; height:95%; background-color:grey">
			<ul>
				<li><a href="/display">SEE ALL TRAVELLERS</a></li>
				<br>
				<li><a href="/findByDestination">SEARCH BY DESTINATION </a></li>
				<br>
				<li><a href="/findBySource">SEARCH BY SOURCE</a></li>
				<br>
				<li><a href="/addUser">REGISTER HERE</a></li>
			</ul>
		</nav>
		<h2>
			BOOK YOUR BUS
			</h1>
			<form action="/add" id="addForm" method="post"
				modelAttribute="bookingDetails">
				<table>
					<tr>
						<td>Name:</td>
						<td><input type="text" id="name" name="travellerName"></td>
					</tr>
					<tr>
						<td>Source:</td>
						<td><input type="text" id="source" name="source"></td>
					</tr>
					<tr>
						<td>Destination:</td>
						<td><input type="text" id="destination" name="destination"></td>
					</tr>
					<tr>
						<td>Price:</td>
						<td><input type="number" id="price" name="price"></td>
					</tr>
					<tr>
						<td>Travel Date</td>
						<td><input type="text" id="travelDate" name="dateOfTravel" required></td>
					</tr>
					<tr>
						<td>Booking Date</td>
						<td><input type="text" id="bookingDate" name="dateOfBooking" required></td>
					</tr>
					<tr>
						<td><input type="submit" value="ADD" /></td>
						<td><input type="button" value="Cancel" onclick="location.href='/'"/></td>
					</tr>
				</table>
			</form>

			
	</div>
	<div class="footer"
				style="background-color: lightgreen; text-align: center">
				<h3>@mindtree.com</h3>
			</div>

</body>
</html>