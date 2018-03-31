package model;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Appointment")

public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Transient
	private Customer customer;
	@ManyToOne
	@JoinColumn(name = "pet_id")
	private Pet pet;
	@ManyToOne
	@JoinColumn(name = "service_id")
	private Services services;
	@Transient
	protected double upcharge;
	@Column(name = "Appointment_date")
	private LocalDate appointmentDate;
	@Column(name = "start_time")
	private LocalTime startTime;
	@Column(name = "end_time")
	private LocalTime endTime;
	@Column(name = "total_cost")
	private double totalCost;
	@Transient
	private final double WEIGHT1 = 25;
	@Transient
	private final double WEIGHT2 = 50;
	@Transient
	private final double WEIGHT3 = 51;
	@Transient
	private final double WEIGHT_UP_CHARGE1 = 10;
	@Transient
	private final double WEIGHT_UP_CHARGE2 = 20;
	@Transient
	DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM d, yyyy");
	@Transient
	DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("h:mm a");
	@Transient
	DecimalFormat df = new DecimalFormat("$#0.00");
	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(Customer customer, Pet pet, Services services, LocalDate appointmentDate) {
		super();
		this.customer = customer;
		this.pet = pet;
		this.services = services;
		this.appointmentDate = appointmentDate;
		setTotalCost();
	}


	public Appointment(Customer customer, Pet pet, Services services, LocalDate appointmentDate, LocalTime startTime) {
		super();
		this.customer = customer;
		this.pet = pet;
		this.services = services;
		this.appointmentDate = appointmentDate;
		this.startTime = startTime;
		setTotalCost();
		setEndTime();
	}

	public Appointment(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public Services getServices() {
		return services;
	}

	public void setServices(Services services) {
		this.services = services;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost() {
		upcharge = calculateUpcharge(pet.getWeight());
		this.totalCost = services.getCost() + upcharge;
	}
public String getUpcharge() {
	this.upcharge = calculateUpcharge(pet.getWeight());
	return df.format(upcharge);
}
	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime() {
		this.endTime = startTime.plusMinutes(45);
	}

	
	@Override
	public String toString() {
		return "Appointment [id=" + id + ", customer=" + customer + ", pet=" + pet + ", services=" + services
				+ ", appointmentDate=" + appointmentDate + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", totalCost=" + totalCost + ", WEIGHT1=" + WEIGHT1 + ", WEIGHT2=" + WEIGHT2 + ", WEIGHT3=" + WEIGHT3
				+ ", WEIGHT_UP_CHARGE1=" + WEIGHT_UP_CHARGE1 + ", WEIGHT_UP_CHARGE2=" + WEIGHT_UP_CHARGE2 + "]";
	}

	public String printReceipt() {
		return "Customer ID: " + customer + "\nPet ID: " + pet + "\nGrooming Package: " + services + "\nAppointment Date: " + appointmentDate + "\nTotal Cost: " + totalCost;
	}

	public double calculateUpcharge(double weight) {
		double upcharge = 0;
		if(weight >= WEIGHT1 && weight <= WEIGHT2 ) {
			upcharge = WEIGHT_UP_CHARGE1;
		} else if(weight >= WEIGHT3) {
			upcharge = WEIGHT_UP_CHARGE2;
		}
		return upcharge;
	}

}