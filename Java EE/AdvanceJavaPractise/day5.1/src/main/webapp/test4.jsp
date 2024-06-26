<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h5>from 1st page</h5>
	<%--display product details using EL syatax --%>
	<%-- <h5>product id - ${param.pid}</h5>
<h5>product name - ${param.p_name}</h5>
<h5>product price - ${param.price}</h5>
<h5>${param}</h5> --%>

	<%--create attr to store product details n forward the client to test5.jsp--%>
	<%
	/* pw.flush();//illegal state exc */
	
	//create request scoped attribute to store product details
	String details = request.getParameter("pid") + " " + request.getParameter("p_name") + " "
			+ request.getParameter("price");
	request.setAttribute("prod_details", details);
	out.flush();
	%>
	<%-- <jsp:forward page="test5.jsp"></jsp:forward> --%>
	<%-- <jsp:forward page="test5.jsp"/></body> --%>
	
	<jsp:include page="test5.jsp"></jsp:include>
</html>