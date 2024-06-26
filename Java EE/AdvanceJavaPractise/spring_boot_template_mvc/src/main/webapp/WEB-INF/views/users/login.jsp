<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%-- <%@ taglib uri="http:java.sun.com/jsp/jstl/core" prefix="c" %> --%> <!--this will give jasperException  -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Login Form</title>
</head>
<body>
	<c:url var="abc" value="/users/login"/>
		<h5 style="color: red;">${requestScope.message}</h5>
		<!-- to get error msg from UserController in case of invalid login -->
		<!-- <form action="/users/login" method="post"> -->
		<form action="${abc}" method="post">
			<table style="background-color: lightgrey; margin: auto">
				<tr>
					<td>Enter User Email</td>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td>Enter Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login" /></td>
				</tr>
			</table>
		</form>
</body>
</html>