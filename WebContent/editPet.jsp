<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Pet Information</title>
</head>
<h1>Update Pet Information</h1>
<body>
<p> Please update your pet information as needed. </p>
<body>
	<form action = "editAppointmentServlet" method = "post">
	Name: <input type = "text" name = "petName" value = "${petToEdit.petName}"><br/><br/>
	Weight: <input type = "text" name = "weight" value = "${petToEdit.weight}"><br/><br/>
	Is your pet current on all vaccinations (Y/N): <input type = "text" name = "hasShots" value = "${petToEdit.hasShots}"><br/><br/>
	<input type = "hidden" name = "id" value = "${petToEdit.id}">
	<input type = "submit" value = "Save Pet Information" name = "doThisToItem">
	</form>
</body>
</html>