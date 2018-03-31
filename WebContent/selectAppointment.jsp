<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Select Appointment</title>
</head>
<h1>List of Scheduled Grooming Appointments</h1>
<body>
<form method = "post" action = "viewAppointmentServlet">
<p> Please select an appointment you would like to view.</p>
<table>
<c:forEach items = "${requestScope.matchingAppointments}" var = "currentappointment">
<tr>
	<td><input type="radio" name="id" value="${currentappointment.id}"></td>
	<td>${currentappointment.customer.lastName}</td>
	<td>${currentappointment.pet.petName}</td>
	<%-- <td>${': '}</td> --%>
	<td>${currentappointment.appointmentDate}</td>
</tr>
</c:forEach>
</table>
<input type = "submit" value = "Select Appointment" name = "doThisToAppt">
<input type = "submit" value = "New Appointment" name = "doThisToAppt">
<input type = "submit" value = "Back to Menu" name = "doThisToAppt">
</form>
</body>
</html>