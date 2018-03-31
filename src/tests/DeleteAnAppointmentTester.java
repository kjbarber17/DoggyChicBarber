package tests;



import controller.AppointmentHelper;
import model.Appointment;

public class DeleteAnAppointmentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AppointmentHelper appthelp = new AppointmentHelper();
		Appointment toDelete = new Appointment(7);
		appthelp.deleteAppointment(toDelete);
		
		System.out.println((appthelp.showAllAppointments()));

	}

}
