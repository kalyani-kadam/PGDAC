<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category List Page</title>
</head>
<body>
	<table style="background-color: lightgrey; margin: auto">
		<caption>Category List</caption>
		<c:forEach var="category" items="${requestScope.all_categories}">
			<tr>
				<td>${category.id}</td>
				<td>${category.name}</td>
				<td>${category.description}</td>
				<td>${category.creationDate}</td>
				<td>${category.updatedOn}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>