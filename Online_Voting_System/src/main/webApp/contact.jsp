<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Online voting System</title>
</head>
<%@ include file="navbar.jsp" %>
<body>
<div class="form-container">
<form action="ContactUs" method="post">
<label for="name" class="form-element"><b>Name :</b></label>
<br>
<input id="name" name="name" class="form-element form-input" type="text"/>
<br>
<label for="number" class="form-element"><b>Phone Number :</b></label>
<br>
<input id="number" name="number" class="form-element form-input" type="number"/>
<br>
<label for="email" class="form-element"><b>Email :</b></label>
<br>
<input id="email" name="email" class="form-element form-input" type="email"/>
<br>
<label for="comment" class="form-element"><b>Comments :</b></label>
<br>
<textarea id="comment" name="comment" class="form-element form-input" ></textarea>
<br>
<button type="Submit" class="form-element form-button">Submit</button>
</form>
</div>
</body>
</html>