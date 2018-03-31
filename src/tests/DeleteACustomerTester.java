package tests;

import controller.CustomerHelper;
import model.Customer;

public class DeleteACustomerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Delete customer from database
		CustomerHelper custhelp = new CustomerHelper();
		Customer custToDelete = new Customer(1);
		custhelp.deleteCustomer(custToDelete);
	
		System.out.println((custhelp.showAllCustomers()));
	}

}
