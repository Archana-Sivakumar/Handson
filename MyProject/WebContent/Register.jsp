<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="model.Registration"%>
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
		<%
			List<Registration> rList = (List<Registration>) request.getAttribute("regList");

			for (int i = 0; i < rList.size(); i++) {
		%>
		<tr>
			<td><%=rList.get(i).getFirstName()%></td>
			<td><%=rList.get(i).getLastName()%></td>
			<td><%=rList.get(i).getDateOfBirth()%></td>
			<td><%=rList.get(i).getAge()%></td>
			<td><%=rList.get(i).getGender()%></td>
			<td><%=rList.get(i).getEmailId()%></td>
			<td><%=rList.get(i).getContactNo()%></td>
			<td>
				<%
					String[] hobby = rList.get(i).getHobbies();
						for (int j = 0; j < hobby.length; j++) {
				%> <%=hobby[j]%><br> <%
 	}
 %>
			</td>
			<td><%=rList.get(i).getAddress()%></td>
			<td><%=rList.get(i).getCountry()%></td>
		</tr>

		<%} %>



	</table>
</body>
</html>