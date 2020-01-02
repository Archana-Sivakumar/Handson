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
<h2>Newsletter Preference</h2>
<form action="PreferenceHandlerServlet" method="post">
<table>
<tr><td>
<c:choose>
<c:when test="${userobj.preference=='true'}">
Include Promos and Offers <input type="checkbox" name="preference" value="true" checked="checked"></c:when>
<c:otherwise> 
Include Promos and Offers<input type="checkbox" name="preference" value="true"></c:otherwise></c:choose></td></tr>
<tr><td><input type="submit" value="Back"></td></tr>
</table>
</form>
</body>
</html>