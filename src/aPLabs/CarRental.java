package aPLabs;

import java.util.Scanner;

public class CarRental {
	
	private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String make, model, plate;

	public CarRental() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public static void main(String[] args) {
		CarRental companyA = new CarRental();
		
		companyA.run();
		
		
		
		
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Make : ");
		make = sc.nextLine();
		System.out.print("Model : ");
		model = sc.nextLine();
		System.out.print("Plate : ");
		plate = sc.nextLine();
		
		rent(make,model,plate);
	}
	
	/**
	 * Prints data for car rental
	 * 
	 * @param make Car make
	 * @param model model of the car
	 * @param plate license plate of the car
	 */
	public void rent(String make, String model, String plate) {
		
		
		
		int numb = (int)plate.charAt(0) + (int)plate.charAt(1) + (int)plate.charAt(2) +
				Integer.parseInt(plate.substring(4, 7));
		
		String b = ALPHABET.substring((numb % 26) , (numb % 26)+1);
		
		String output = b + numb;
		
		System.out.printf("Make = %s\n" + 
				"Model = %s\n" + 
				"%s = %s", make, model, plate, output);
	}

}
