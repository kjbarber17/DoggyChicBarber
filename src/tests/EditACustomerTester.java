package tests;

import controller.CustomerHelper;
import model.Customer;


public class EditACustomerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerHelper custhelp = new CustomerHelper();
		Customer toEdit = custhelp.searchForCustomerById(13);
		
		toEdit.setCity("Davenport");
		custhelp.updateCustomer(toEdit);
		
		System.out.println((custhelp.showAllCustomers()));
	}

}
