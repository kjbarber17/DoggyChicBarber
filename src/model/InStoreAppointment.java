/*package model;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="appointment")

public class InStoreAppointment extends Appointment{

	@Column(name = "start_time")
	private LocalTime dropoff;
	@Column(name = "end_time")
	private LocalTime pickup;
	@Column(name = "appt_cd")
	private final char TYPE = 'I';

	public InStoreAppointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InStoreAppointment(Customer customer, Pet pet, Services services, LocalDate appointmentDate) {
		super(customer, pet, services, appointmentDate);
		// TODO Auto-generated constructor stub
	}

	public InStoreAppointment(Customer customer, Pet pet, Services services, LocalDate appointmentDate,
			LocalTime pickup, LocalTime dropoff) {
		super(customer, pet, services, appointmentDate);
		this.pickup = pickup;
		this.dropoff = dropoff;
	}

	public InStoreAppointment(Customer customer, Pet pet, Services services, LocalDate appointmentDate,
			LocalTime dropoff) {
		super(customer, pet, services, appointmentDate);
		this.dropoff = dropoff;
		setPickup();
	}

	public LocalTime getPickup() {
		return pickup;
	}

	public void setPickup() {
		this.pickup = dropoff.plusMinutes(45);
	}

	public LocalTime getDropoff() {
		return dropoff;
	}

	public void setDropoff(LocalTime dropoff) {
		this.dropoff = dropoff;
	}

	@Override
	public String printReceipt() {
		// TODO Auto-generated method stub
		return super.printReceipt() + "\nPickup Time: " + pickup + "\nDropoff Time: " + dropoff;
	}


}
*/