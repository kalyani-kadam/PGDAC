<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Blogger's home</title>
</head>
<body>
	<h3>Bloggers home</h3>
	<h3 style="color: green">${sessionScope.message}</h3>
	<h5>User details: ${sessionScope.user_details}</h5>
</body>
</html>