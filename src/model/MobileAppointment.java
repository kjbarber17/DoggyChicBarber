/*package model;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="appointment")

public class MobileAppointment extends Appointment{
	
	@Column(name = "start_time")
	private LocalTime arrival;
	@Column(name = "end_time")
	private LocalTime departure;
	private String address;
	private int distance;
	private final double MOBILE_FEE = 20;//need to figure out fee
	@Column(name = "appt_cd")
	private final char TYPE = 'M';
	
	public MobileAppointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MobileAppointment(Customer customer, Pet pet, Services services, LocalDate appointmentDate) {
		super(customer, pet, services, appointmentDate);
		// TODO Auto-generated constructor stub
	}

	public MobileAppointment(Customer customer, Pet pet, Services services, LocalDate appointmentDate,
			LocalTime arrival, LocalTime departure, String address, int distance) {
		super(customer, pet, services, appointmentDate);
		this.arrival = arrival;
		this.departure = departure;
		this.address = address;
		this.distance = distance;
	}

	public MobileAppointment(Customer customer, Pet pet, Services services, LocalDate appointmentDate,
			LocalTime arrival) {
		super(customer, pet, services, appointmentDate);
		this.arrival = arrival;
	}

	public LocalTime getArrival() {
		return arrival;
	}

	public void setArrival(LocalTime arrival) {
		this.arrival = arrival;
	}

	public LocalTime getDeparture() {
		return departure;
	}

	public void setDeparture() {
		this.departure = arrival.plusMinutes(45);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	//public double getMobileFee() {
		//return mobileFee;
	//}

	//public void setMobileFee(double mobileFee) {
		//this.mobileFee = mobileFee;
	//}

	@Override
	public String toString() {
		return "MobileAppointment [arrival=" + arrival + ", departure=" + departure + ", address=" + address
				+ ", distance=" + distance + ", mobileFee=" + MOBILE_FEE + "]";
	}
	
	
}
*/