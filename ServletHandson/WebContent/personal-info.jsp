<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="PersonalInformationHandlerServlet" method="post">
<table>
		<tr>
			<td>Name</td>
			<td>:</td>
			<td><input type="text" name="username" value="${userobj.name}"></td>
		</tr>
		<tr>
			<td>Email Address</td>
			<td>:</td>
			<td><input type="email" name="email"value="${userobj.emailAddress}" >
			</td>
		</tr>
		<tr>
				<td><input type="submit" value="Next"></td>
			</tr>
</table>
</form>
</body>
</html>