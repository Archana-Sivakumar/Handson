<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, tr, td {
	border: 1px solid black;
	border-collapse: collapse;
	padding: 5px;
}
</style>
</head>
<body>
	<table>
		<tr>
			<th>FirstName</th>
			<th>LastName</th>
			<th>DateOfBirth</th>
			<th>Age</th>
			<th>Gender</th>
			<th>Email Id</th>
			<th>Contact no</th>
			<th>Hobby</th>
			<th>Address</th>
			<th>Country</th>
		</tr>

		<c:forEach items="${regList}" var="register">
			<tr>
				<td>${register.firstName}</td>
				<td>${register.lastName}</td>
				<td>${register.dateOfBirth}</td>
				<td>${register.age}</td>
				<td>${register.gender}</td>
				<td>${register.emailId}</td>
				<td>${register.contactNo}</td>
				<td><c:forEach items="${register.hobbies}" var="hobby">
                        ${hobby}
                    </c:forEach></td>
				<td>${register.address}</td>
				<td>${register.country}</td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>