<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Details Page</title>
</head>
<body>
	<%
	//JSP scriptlet
	String email = request.getParameter("em");
	String pwd = request.getParameter("pass");
	out.print("<h4> Email " + email + " Password " + pwd + "</h4>");
	%>
</body>
</html>