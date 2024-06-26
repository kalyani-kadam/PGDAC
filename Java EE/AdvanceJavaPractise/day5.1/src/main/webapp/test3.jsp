<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- try to display members of test2.jsp page --%>
<h5>Instance variable- <%= msg1 %></h5>
<h5>local variable- <%= msg2 %></h5>
<h5>Page scoped attr- <%= pageContext.getAttribute("nm1") %></h5>
<h5>Page scoped attr- ${pageScope.nm1}</h5>
</body>
</html>