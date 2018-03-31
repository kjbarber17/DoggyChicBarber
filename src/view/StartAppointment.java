package view;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import model.Customer;
import model.Pet;
import model.Services;

public class StartAppointment {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Doggy Chic! ");
		System.out.println();
		System.out.println("Please schedule your pet's grooming appointment: ");
		LocalDate date = setAppointmentDate();
		LocalTime start = setAppointmentTime();
		System.out.println();

		System.out.println("Please provide additional information for your appointment on " + date + " at " + start + ":");
		Customer cust1 = getCustomerInfo();
		System.out.println();
		Pet pet1 = getPetInfo(cust1);
		System.out.println();
		Services services1 = getServiceInfo();
		System.out.println();

		//InStoreAppointment appt1 = new InStoreAppointment(cust1, pet1, services1, date, start);
		//MobileAppointment appt2 = new MobileAppointment(cust1, pet1, services1, date, start);

		//System.out.print("Please enter I for in-store appointment or M for mobile appointment:");
		//String type = in.nextLine();
		//while(!(type.equals("I")) && !(type.equals("M"))) {
		//	System.out.print("Please enter i or m: ");
			//in.nextLine();
		} 

		//System.out.println();
		//if(input.equals("I")) {
			//System.out.println(appt1.printReceipt());
		//} else if (input.equals("M")){
			//System.out.println(appt1.printReceipt());
	//	}
	//}

	public static LocalDate setAppointmentDate() {
		int year = LocalDate.now().getYear();
		int month = 0;
		System.out.print("Please enter month (1-12); ");
		if(in.hasNextInt()) {
			month = in.nextInt();
			in.nextLine();
		}else {
			System.out.print("Month is not valid, please enter 1-12: ");
			month = in.nextInt();
			in.nextLine();
		}
		while(!(month>=1 && month <=12)) {
			System.out.print("Month is not valid, please enter 1-12: ");
			month = in.nextInt();
			in.nextLine();
		}
		int day = 0;
		System.out.print("Please enter day: ");
		if(in.hasNextInt()) {
			day = in.nextInt();
			in.nextLine();
		}else {
			System.out.print("Day is not valid, please enter day as numeral: ");
			day = in.nextInt();
			in.nextLine();
		}
		if(month == 4 || month == 6 || month == 9 || month == 11) {
			if (day < 1 || day > 30) {
				System.out.print("Day is not valid, please enter day 1-30: ");
				day = in.nextInt();
				in.nextLine();
			}
		}else if (month == 2) {
			boolean isLeapYear = ((year %4 == 0)&& (year % 100 !=0)||(year%400 == 0));
			if(isLeapYear) {
				if(day<1 || day>29) {
					System.out.print("Day is not valid, please enter day 1-29: ");
					day = in.nextInt();
					in.nextLine();
				}else {

				}
			}
		}else {
			if(day<1 || day>31) {
				System.out.print("Day is not valid, please enter day 1-31: ");
				day = in.nextInt();
				in.nextLine();
			}
		}
		LocalDate appointmentDate = LocalDate.of(year, month, day);
		return appointmentDate;
	}		

	private static LocalTime setAppointmentTime() {
		System.out.print("Would you like an AM or PM appointment? ");
		String input = in.nextLine();
		while(!input.equalsIgnoreCase("am") || input.equalsIgnoreCase("pm")){
			System.out.print("Invlaid input, please enter AM or PM: ");
			input = in.nextLine();
		}
		int hour = 0;
		System.out.print("Please enter the start time of your appointment--" + "\nHour: ");
		if(in.hasNextInt()) {
			hour = in.nextInt();
			in.nextLine();
		}else {
			System.out.print("Hour is not valid, please enter hour 1-12): ");
			hour = in.nextInt();
			in.nextLine();
		}
		while (!(hour >= 1 && hour <= 12)) {
			System.out.print("Invalid input. Please enter hour (1-12): ");
			hour = in.nextInt();
			in.nextLine();
		}
		if (input.equalsIgnoreCase("pm") && hour != 12) {
			hour += 12;
		}
		if (input.equalsIgnoreCase("am") && hour == 12) {
			hour = 0;
		}
		int minute = 0;
		System.out.print("Minute: ");
		if (in.hasNextInt()) {
			minute = in.nextInt();
			in.nextLine();
		} else {
			System.out.print("Invalid input. Please enter minute (01-59): ");
			minute = in.nextInt();
			in.nextLine();
		}
		while (!(minute >= 1 && minute <= 59)) {
			System.out.print("Invalid input. Please enter minute (01-59): ");
			minute = in.nextInt();
			in.nextLine();
		}
		LocalTime startTime = LocalTime.of(hour, minute);
		return startTime;
	}
	public static Customer getCustomerInfo() {
		System.out.print("Please enter your first and last name: ");
		String firstName = in.nextLine();
		String lastName = in.nextLine();
		System.out.print("Please enter your phone number (XXX) XXX-XXXX: ");
		String phoneNumber = in.nextLine();
		System.out.print("Please enter your full address (street, city, state, and zip code): "); 
		String streetAddress = in.nextLine();
		String city = in.nextLine();
		String state = in.nextLine();
		String zipCode = in.nextLine();

		Customer cust = new Customer(firstName, lastName, phoneNumber, streetAddress, city, state, zipCode);
		return cust;
	}
	public static Pet getPetInfo(Customer cust) {
		System.out.print("Please enter pet name: ");
		String petName = in.nextLine();
		System.out.print("Please enter pet's weight: ");
		double weight = in.nextDouble();
		System.out.print("Is pet current with all shots, please input Y or N? ");
		String shots = in.next();
		char hasShots = 0;
		if(shots.contains("y")) {
			hasShots = 'Y';
		}else {
			hasShots = 'N';
		}
		in.nextLine();
		if (hasShots == 'N'){
			System.out.println("Pet must be current with shots, will need proof of shots for appointment ");
		}
		Pet pet = new Pet(petName, weight, hasShots, cust);
		return pet;
	}
	private static Services getServiceInfo() {
		Services service = new Services();
		System.out.println("***Service plans***");
		System.out.println(service.getPlanName());
		System.out.print("Select plan: ");
		String planName = in.nextLine();
		service.setPlanName(planName);
		return service;
	}
}





