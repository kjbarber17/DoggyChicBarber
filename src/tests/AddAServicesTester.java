package tests;

import controller.ServicesHelper;
import model.Services;

public class AddAServicesTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Insert services to database for lookup table
		ServicesHelper servicehelp = new ServicesHelper();
		Services Basic = new Services("basic");
		servicehelp.insertServices(Basic);
		
		Services Premium = new Services("premium");
		servicehelp.insertServices(Premium);
		
		Services Super = new Services("super");
		servicehelp.insertServices(Super);

		}

}