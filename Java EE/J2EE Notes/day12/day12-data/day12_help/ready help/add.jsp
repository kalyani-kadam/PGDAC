<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Employee</title>
</head>
<body>
	<%--firstName,  lastName,  email,  password,confirmPassword joinDate, type,  salary --%>
	<form:form method="post" modelAttribute="employee">
		<table style="background-color: lightgrey; margin: auto">
			<caption>Employee Registration Form</caption>

			<tr>
				<td>Enter First Name</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>Enter Last Name</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>Enter Email</td>
				<td><form:input type="email" path="email" /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><form:password  path="password" /></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><form:password  path="confirmPassword" /></td>
			</tr>
			<tr>
				<td>Choose Employment Type</td>
				<%-- <td><form:input  path="role" /></td> --%>
				<td><form:radiobutton path="type" value="FULL_TIME" />Full Time Role</td>
				<td><form:radiobutton path="type" value="PART_TIME" />Part Time Role</td>
				<td><form:radiobutton path="type" value="CONTRACT" />Contract Role</td>
			</tr>
			<tr>
				<td>Select Join Date</td>
				<td><form:input type="date"  path="joinDate" /></td>
			</tr>
			<tr>
				<td>Enter Salary</td>
				<td><form:input type="number"  path="salary" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add New Employee" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>