<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Appointment Information</title>
</head>
<h1>Your Appointment details for ${pet.petName}</h1>
<img src="images/dogs.jpg">
<body>
<p>Please review your appointment details and update as needed.</p>
<form method = "post" action = "editAppointmentServlet">
<h3>Customer Information</h3>
<input type = "hidden" name = "custId" value = "${customer.id}">
Name: ${customer.firstName} ${customer.lastName} <br/><br/>
Address: ${customer.streetAddress}, ${customer.city}, ${customer.state} ${customer.zipcode} <br/><br/>
Phone Number: ${customer.phoneNumber} <br/><br/>
<h4>Pet Information</h4>
<input type = "hidden" name = "petId" value = "${pet.id}">
Name: ${pet.petName} <br/><br/>
Weight: ${pet.weight} <br/><br/>
Vaccinations Current: ${pet.hasShots} <br/><br/>
<h5>Appointment Scheduled</h5>
<input type = "hidden" name = "apptId" value = "${appointment.id}">
Date: ${appointment.appointmentDate} <br/><br/>
Start Time: ${appointment.startTime} <br/><br/>
End Time: ${appointment.endTime} <br/><br/>
Services: ${services.description} - $${services.cost} <br/><br/>
Pet Weight Upcharge: ${appointment.upcharge} <br/><br/>
Total Cost: $${appointment.totalCost}<br/><br/>
<input type = "submit" value = "New Appointment" name = "doThisToItem">
<input type = "submit" value = "Edit Customer Info" name = "doThisToItem">
<input type = "submit" value = "Edit Pet Info" name = "doThisToItem">
<input type = "submit" value = "Edit Appointment" name = "doThisToItem">
<input type = "submit" value = "Cancel Appointment" name = "doThisToItem">
<input type = "submit" value = "Back to Menu" name = "doThisToItem">

</form>
</body>
</html>