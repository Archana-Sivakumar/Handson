<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
        int n1 = (int)request.getAttribute("number1");
		int n2 = (int) request.getAttribute("number2");
		int n3 = (int) request.getAttribute("result");
		//out.println("The sum of " + n1 + " and " + n2 + " is: " + n3);
		%>
		<h2>
		The sum of <%=n1%> and <%=n2%> is <%=n3%>
		</h2>
</body>
</html>