<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Appointment</title>
</head>
<h1>Reschedule appointment</h1>
<body>
<form action = "editAppointmentServlet" method = "post">
<label for ="appointmentDate">Select appointment date:</label>
<input type = "date" name = "appointmentDate"  value = "${appointmentToEdit.appointmentDate}"><br /><br />
<label for = "startTime">Select an appointment time: </label>
<input type = "time" name = "startTime" value = "${appointmentToEdit.startTime}"><br /><br />
Select Service Package: <select name = "planName">
	<option value = "basic">Wash, dry, and nail trim - $30</option>
	<option value = "premium">Wash, dry, nail trim, haircut - $40</option>
	<option value = "super">Wash, dry, nail trim, haircut, and furminator - $50</option>
	</select><br /><br />
<input type = "hidden" name = "id" value = "${appointmentToEdit.id}">
<input type = "submit" value = "Save Edited Appointment" name = "doThisToItem">
</form>
</body>
</html>