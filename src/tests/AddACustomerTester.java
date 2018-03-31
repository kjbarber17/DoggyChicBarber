package tests;

import controller.CustomerHelper;
import model.Customer;

public class AddACustomerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Insert customer to database
				CustomerHelper custhelp = new CustomerHelper();
				Customer Barber = new Customer("Kelly", "Barber", "123 Main St", "Des Moines", "Ia","50392", "5158675309");
				custhelp.insertCustomer(Barber);

				System.out.println((custhelp.showAllCustomers()));
				}

}
