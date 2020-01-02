<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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
		<c:set value="${menuList}" var="menu" />
							<c:when test="${menuList.equals("none") }">
								<option value="none" label="--Select--"></option>
							</c:when>
							<c:otherwise>
								<option value="none" label="--Select--" selected="selected"></option>
	
</body>
</html>