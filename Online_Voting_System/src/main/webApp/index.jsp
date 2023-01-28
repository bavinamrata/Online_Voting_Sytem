<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet"  type="text/css"  href="style.css">

<meta charset="ISO-8859-1">
<title>Online Voting System </title>
</head>
<%@ include file="navbar.jsp" %>

<body>
<!-- login form created -->
<div class="form-container">
<!-- when we click on login button it's send action request to the post method -->
<form action="voterLogin" method="post">  
		<h3>Enter Voting Number</h3>
		<label for="voterNumber" class="form-element">
		<b>Voter-Id</b>
		</label>
		<br>
		<input name="voterNumber" class="form-element form-input" id="voterNumber" type="text"/>
		<br>
		<button type="submit" class="form-element form-button"> Login </button>
		<br>
		<a href="adminLogin.jsp" class="index-a"> Admin </a>
</form>
</div>
</body>
</html>