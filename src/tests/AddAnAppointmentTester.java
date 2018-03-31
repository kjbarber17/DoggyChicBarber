package tests;

import java.time.LocalDate;
import java.time.LocalTime;

import controller.AppointmentHelper;
import controller.CustomerHelper;
import controller.PetHelper;
import model.Appointment;
import model.Customer;
import model.Pet;
import model.Services;

public class AddAnAppointmentTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerHelper custhelp = new CustomerHelper();
		Customer Barber = new Customer("Kelly", "Barber", "123 Main St", "Des Moines", "Ia","50392", "5158675309");
		custhelp.insertCustomer(Barber);

		PetHelper pethelp = new PetHelper();
		Pet Lexie = new Pet("Lexie", 79, 'y', Barber);
		pethelp.insertPet(Lexie);

		Services Basic = new Services("basic");

		AppointmentHelper appthelp = new AppointmentHelper();
		Appointment Kelly = new Appointment (Barber, Lexie, Basic, LocalDate.now(), LocalTime.now());
		appthelp.insertAppointment(Kelly);

		System.out.println((appthelp.showAllAppointments()));
	}
}
