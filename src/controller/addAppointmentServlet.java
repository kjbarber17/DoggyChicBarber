package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Appointment;
import model.Customer;
import model.Pet;
import model.Services;

/**
 * Servlet implementation class addAppointmentServlet
 */
@WebServlet("/addAppointmentServlet")
public class addAppointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public addAppointmentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AppointmentHelper ah = new AppointmentHelper();

		LocalDate appointmentDate = LocalDate.parse(request.getParameter("appointmentDate"));
		LocalTime startTime = LocalTime.parse(request.getParameter("startTime"));

		String planName = request.getParameter("planName");
		System.out.println("plan name is" + planName);
		Services service = new Services(planName);
		//System.out.println("Value in services" + );
		
		Customer customer = (Customer)getServletContext().getAttribute("customer");
		Pet pet = (Pet)getServletContext().getAttribute("pet");

		Appointment appointment = new Appointment(customer, pet, service, appointmentDate, startTime);
		ah.insertAppointment(appointment);

		request.setAttribute("customer", customer);
		request.setAttribute("pet", pet);
		request.setAttribute("services", service);
		request.setAttribute("appointment", appointment);

		request.getRequestDispatcher("/viewAppointment.jsp").forward(request, response);
	}

}
