package tests;

import controller.CustomerHelper;
import controller.PetHelper;
import model.Customer;
import model.Pet;

public class AddAPetTester {

	public static void main(String[] args) {

		//Insert pet to database
		CustomerHelper custhelp = new CustomerHelper();
		PetHelper pethelp = new PetHelper();
		
		Customer Barber = new Customer("Kelly", "Barber", "123 Main St", "Des Moines", "Ia","50392", "5158675309");
		custhelp.insertCustomer(Barber);
		
		Pet Lexie = new Pet("Lexie", 79, 'y', Barber);
		pethelp.insertPet(Lexie);
		
		System.out.println((pethelp.showAllPets()));
	}

}