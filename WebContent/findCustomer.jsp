<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find Customer</title>
</head>
<body>
<h1>Customer List</h1>
	<form method = "post" action = "setCustomerServlet"><br /><br />
	<p>Please select customer you are searching for:</p><br /><br />
	<table>
	<c:forEach items = "${requestScope.matchingCustomers}" var = "currentcustomer">
	<tr>
		<td><input type="radio" name="id" value="${currentcustomer.id}"></td>
		<td>${currentcustomer.firstName}</td>
		<td>${currentcustomer.lastName}</td>
		<td>${currentcustomer.streetAddress}</td>
		<td>${currentcustomer.city}</td>
		<td>${currentcustomer.state}</td>
	</tr>
	</c:forEach>
	</table>
	<input type = "submit" value = "Select Customer" name = "doThisToItem">
	<input type = "submit" value = "New Customer" name = "doThisToItem">
	</form>
</body>
</html>