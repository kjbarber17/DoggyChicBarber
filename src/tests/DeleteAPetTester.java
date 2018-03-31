package tests;

import controller.PetHelper;
import model.Pet;

public class DeleteAPetTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PetHelper pethelp = new PetHelper();
		Pet petToDelete = new Pet(1);
		pethelp.deletePet(petToDelete);

		System.out.println((pethelp.showAllPets()));
	}

}
