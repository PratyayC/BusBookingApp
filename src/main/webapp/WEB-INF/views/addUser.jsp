<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>

<script src="js/userValidation.js"></script>
<title>Insert title here</title>
</head>
<body style="background-color: lightblue">
	<div align="center">
		<form action="/showUser" modelAttribute=user id="userForm"
			method="post">
			<h1>User Registration Form</h1>
			<hr>
			<table>
				<tr>
					<td>First Name:</td>
					<td><input type="text" id="fname" name="uFirstName"></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><input type="text" id="lname" name="uLastName"></td>
				</tr>
				<tr>
					<td>DOB:</td>
					<td><input type="date" id="dob" name="date" required></td>
				</tr>
				<tr>
					<td>Hobbies:</td>
					<td><select id="hobbies" name="hobbies" multiple value="choose">
							<option value="biking">biking</option>
							<option value="trekking">trekking</option>
							<option value="racing">racing</option>
							<option value="skydiving">skydiving</option>
					</select></td>
					<td>
				</tr>
				<tr>
					<td>Gender:</td>
					<td><input type="radio" id="gender" name="gender" value="male">Male</td>
					<td><input type="radio" id="gender" name="gender"
						value="female">Female</td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><input type="text" id="address" name="address"></td>
				</tr>
				
				<tr>
				<td>
				<input type="checkbox" id="check" >Agree To T&C.
				</td>
				</tr>
				<tr>
					<td><input type="submit" value="ADD" /></td>
					<td><input type="button" value="Cancel"
						onclick="location.href='/'" /></td>
				</tr>
			</table>


		</form>
	</div>
</body>
</html>