<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<!-- to import additional tag librar => JSTL supplied code tag library -->
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Validation</title>
</head>
<%-- data transfer from req param -- JB --%>
<jsp:setProperty property="*" name="user" />
<body>
<%--invoke B.L method of a Java bean --%>
<%-- <h5> Login status - ${sessionScope.user.validateUser()}</h5> --%>
<c:redirect url="${sessionScope.user.validateUser()}.jsp"/>
<!-- in:goes the key out:comes the value -->
</body>
</html>