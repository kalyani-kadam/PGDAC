<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<jsp:setProperty property="*" name="user" />
<body>
<!-- invoke user beans method for validation n registration -->
	<h5>Registration status - ${sessionScope.user.validateNRegisterUser()}.jsp</h5>
	
</body>
</html>