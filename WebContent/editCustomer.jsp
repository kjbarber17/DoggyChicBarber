<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Customer Information</title>
</head>
<h1>Update Customer Information</h1>
<body>
<p>Please update your information as needed.</p><br/><br/>
<form action = "editAppointmentServlet" method = "post">
	Name: <input type = "text" name = "firstName" value = "${customerToEdit.firstName}">
      <input type = "text" name = "lastName" value = "${customerToEdit.lastName}"><br/><br/>
	Street Address: <input type = "text" name = "streetAddress" value = "${customerToEdit.streetAddress}"><br/><br/>
	City: <input type = "text" name = "city" value = "${customerToEdit.city}"><br/><br/>
	State: <select name = "state" id="state">
	    <option value="" selected disabled hidden>"${customerToEdit.state}"</option>
		<option value="AL">Alabama</option>
		<option value="AK">Alaska</option>
		<option value="AZ">Arizona</option>
		<option value="AR">Arkansas</option>
		<option value="CA">California</option>
		<option value="CO">Colorado</option>
		<option value="CT">Connecticut</option>
		<option value="DE">Delaware</option>
		<option value="DC">District Of Columbia</option>
		<option value="FL">Florida</option>
		<option value="GA">Georgia</option>
		<option value="HI">Hawaii</option>
		<option value="ID">Idaho</option>
		<option value="IL">Illinois</option>
		<option value="IN">Indiana</option>
		<option value="IA">Iowa</option>
		<option value="KS">Kansas</option>
		<option value="KY">Kentucky</option>
		<option value="LA">Louisiana</option>
		<option value="ME">Maine</option>
		<option value="MD">Maryland</option>
		<option value="MA">Massachusetts</option>
		<option value="MI">Michigan</option>
		<option value="MN">Minnesota</option>
		<option value="MS">Mississippi</option>
		<option value="MO">Missouri</option>
		<option value="MT">Montana</option>
		<option value="NE">Nebraska</option>
		<option value="NV">Nevada</option>
		<option value="NH">New Hampshire</option>
		<option value="NJ">New Jersey</option>
		<option value="NM">New Mexico</option>
		<option value="NY">New York</option>
		<option value="NC">North Carolina</option>
		<option value="ND">North Dakota</option>
		<option value="OH">Ohio</option>
		<option value="OK">Oklahoma</option>
		<option value="OR">Oregon</option>
		<option value="PA">Pennsylvania</option>
		<option value="RI">Rhode Island</option>
		<option value="SC">South Carolina</option>
		<option value="SD">South Dakota</option>
		<option value="TN">Tennessee</option>
		<option value="TX">Texas</option>
		<option value="UT">Utah</option>
		<option value="VT">Vermont</option>
		<option value="VA">Virginia</option>
		<option value="WA">Washington</option>
		<option value="WV">West Virginia</option>
		<option value="WI">Wisconsin</option>
		<option value="WY">Wyoming</option>
	</select><br/><br/>
Zipcode (five-digit): <input type="text" name = "zip" value = "${customerToEdit.zipcode}"><br/><br/>
Phone Number (no hyphens): <input type = "text" name = "phoneNumber" value = "${customerToEdit.phoneNumber}"><br/><br/>
<input type = "hidden" name = "id" value = "${customerToEdit.id}">
<input type = "submit" value = "Save Customer Information" name = "doThisToItem">
</form>
</body>
</html>