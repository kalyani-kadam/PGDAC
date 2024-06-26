<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>test 2</title>
</head>
<%!String msg1 = "some msg!!!";//implicitly private scope%>
<body>
	<%
	String msg2 = "another msg!!";//local variable
	pageContext.setAttribute("nm1", 1000);
	%>
	<%@ include file="test3.jsp" %>
</body>
</html>