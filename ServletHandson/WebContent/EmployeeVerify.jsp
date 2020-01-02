<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, tr, td {
	border: none;
	padding: 5px;
	width: 300px;
}
</style>
</head>
<body>
<h2>Employee Details Verification</h2>
<table>
<tr>
<td><b>Id</b></b><br>${id}</td>
<td><b>Name</b><br>${name}</td>
<td><b>Gender</b><br>${gender }</td>
</tr>
<tr>
<td><b>Date</b><br>${dateBirth }</td>
<td><b>Fulltime Employee</b><br>${fulltimeEmp }</td>
<td><b>Department</b><br>${ department}</td>
</tr>
<tr>
<td><b>Salary</b><br>
<c:set var="salary" value="${newSalary }"/>
<fmt:formatNumber value="${salary}" pattern="Rs #,##,###" type="currency" ></fmt:formatNumber>
</td>
</tr>
</table>
</body>
</html>