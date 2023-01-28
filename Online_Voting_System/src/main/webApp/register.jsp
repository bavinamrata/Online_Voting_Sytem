<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta charset="ISO-8859-1">
<title>Register voter</title>
</head>
<%@ include file="adminNavbar.jsp" %>
<body>
<div class="form-container">
<form action="RegisterUser" method="post">

<label for="name" class="form-element"><b>Name:</b></label>
<br>
<input id="name" name="name" class="form-element form-input" type="text"/>
<br>

<label for="address" class="form-element"><b>Address:</b></label>
<br>
<input id="address" name="address" class="form-element form-input" type="text"/>
<br>

<label for="cardnumber" class="form-element"><b>VoterCard_Number:</b></label>
<br>
<input id="cardnumber" name="cardnumber" class="form-element form-input" type="text"/>
<br>

<label for="number" class="form-element"><b>Phone_Number:</b></label>
<br>
<input id="number" name="number" class="form-element form-input" type="number"/>
<br>

<label for="dob" class="form-element"><b>DateOfBirth:</b></label>
<br>
<input id="dob" name="dob" class="form-element form-input" type="date"/>
<br>

<label for="email" class="form-element"><b>Email:</b></label>
<br>
<input id="email" name="email" class="form-element form-input" type="email"/>
<br>

<button type="submit" class="form-element form-button">Register</button>
</form>
</div>
</body>
</html>