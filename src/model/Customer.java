package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")

public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "f_name")
	private String firstName;
	@Column(name = "l_name")
	private String lastName;
	@Column(name = "street_add")
	private String streetAddress;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state; 
	@Column(name = "zip_code")
	private String zipcode;
	@Column(name = "phone")
	private String phoneNumber;


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id) {
		super();
		this.id = id;
	}

	public Customer(String firstName, String lastName, String streetAddress, String city, String state,
			String zipcode, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String printDetails() {
		return "\nCustomer ID: " + id + "\nName: " + firstName + " " + lastName + "\nPhone Number: " + phoneNumber + "\nAddress: " + streetAddress + ", " + city + ", " + state + " " + zipcode;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", streetAddress="
				+ streetAddress + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + ", phoneNumber="
				+ phoneNumber + "]";
	}



}


