<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<%@ include file="navbar.jsp" %>
</head>
<body>
<div class="form-container">
<form action="adminLogin" method="post">
<h3>Admin-Login</h3>
<label for="name" class="form-element form-label"><b>Name</b></label>
<br>
<input id="name" name="adminName" class="form-element form-input" type="text"/>
<br>
<label for="password" class="form-element form-label"><b>Password </b></label>
<br>
<input id="password" name="password" class="form-element form-input" type="password"/>
<br>
<button type="Submit" class="form-element form-button">Login</button>
<br>
</form>
</div>
</body>
</html>