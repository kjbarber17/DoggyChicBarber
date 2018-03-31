package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pet")

public class Pet {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name ="pet_name")
	private String petName;
	private double weight;
	@Column(name="vaccinations")
	private char hasShots;
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;

	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Pet(int id) {
		super();
		this.id = id;
	}

	public Pet(String petName, double weight, char hasShots, Customer customer) {
		super();
		this.petName = petName;
		this.weight = weight;
		this.hasShots = hasShots;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	public char getHasShots() {
		return hasShots;
	}
	public void setHasShots(char hasShots) {
		this.hasShots = hasShots;	

	}

	public Customer getCustomer() {
		return customer;

	}

	public void setCustomer(Customer customer) {
		this.customer = customer;

	}

	public String printDetails(char hasShots) {
		String shots;
		if (hasShots == 'Y') {
			shots = "Yes";
		} else {
			shots = "No";
		}
		return "\nPet ID: " + id + "\nName: " + petName + "\nWeight: " + weight + "\nShots Up-to-Date: " + shots;
	}


	@Override
	public String toString() {
		return "Pet [id=" + id + ", petName=" + petName + ", weight=" + weight + ", hasShots=" + hasShots
				+ ", customer=" + customer + "]";
	}
}
