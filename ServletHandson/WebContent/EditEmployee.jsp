<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
<%@ page import="employee.Employee"%>
<%@ page import="employee.EmployeeDetailsServlet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, tr, td {
	border: none;
	padding: 5px;
	width: 50px;
}
</style>
</head>
<body>
	<h2>Employee Details</h2>
	<form action = "DisplayEmployeeServlet?empId=${emp.empId}" method="post">
	<table>
		<tr>
			<td>ID</td>
			<td>:</td>
			<td>${emp.empId}</td>
		</tr>
		<tr>
			<td>Name</td>
			<td>:</td>
			<td><input type="text" name="empname" value="${emp.empName}" />
			</td>
		</tr>
		<tr>
			<td>GENDER</td>
			<td>:</td>
			<td><c:set var="gender" value="${emp.gender}" /> <input
				type="radio" name="gender" value="Male"
				<c:if test="${gender=='Male'}">checked</c:if>>Male <input
				type="radio" name="gender" value="Female"
				<c:if test="${gender=='Female'}">checked</c:if>>Female</td>
		</tr>
		<tr>
			<td>Date</td>
			<td>:</td>
			<c:set var="dateParse" value="${emp.dateOfBirth}"/>
			<fmt:parseDate value="${dateParse}" var="parsedate" pattern ="dd/MM/yyyy"/>
			<td><input type = "date" name="date" value="<fmt:formatDate type="date" dateStyle="short" value="${parsedate}"/>"/></td>
		</tr>
		<tr>
		    <td>FullTimeEmployee</td>
		    <td><c:set var="fulltime" value="${emp.fulltimeEmployee}" /> <input
				type="checkbox" name="fulltime" value="Yes"
				<c:if test="${fulltime=='Yes'}">checked</c:if>> </td>
		</tr>
		<tr>
		    <td>Department</td>
		    <td>:</td>
		    <td><select name="department">
		     
		    <c:forEach var="empdepartment" items="${emp.department}">
		     <c:choose>
		     <c:when test="${empdepartment=='Information Technology'}">
		     <option name="department" value="${empdepartment}" selected>${empdepartment}</option>
			</c:when>
						<c:otherwise>
						<option   value="${empdepartment}">${empdepartment}</option>
						</c:otherwise>
						 
						</c:choose>
						</c:forEach>
				</select></td>
		</tr>
		<tr>
		    <td>Salary</td>
		    <td>:</td>
			<td><input type="text" name="salary" value="${emp.salary}" />
			</td>
		</tr>
		<tr>
				<td><input type="submit" value="SUBMIT"></td>
			</tr>
	</table>
	</form>
</body>
</html>