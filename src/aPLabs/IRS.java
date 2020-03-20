package aPLabs;

import java.util.Scanner;

public class IRS {
	
	private String status;
	private int income;
	private double tax;

	public IRS() {
	    
	}
	
	public static void main(String[] args) {
		IRS irs = new IRS();
		irs.calculate();
	}
	
	public void calculate() {
		Scanner sc = new Scanner(System.in);  // Create a Scanner object

		System.out.print("Enter marital status (1=single, 2=married): ");
	    status = sc.nextLine();
	    
	    System.out.println("Enter taxable income: $ ");
	    income = Integer.parseInt(sc.nextLine());
	    
	
	    
	    if(status == "1") {
	    	if(income > 0 && income < 27050)
	    		tax = income * 0.15;
	    	else if(income > 27050 && income < 65550)
	    		tax = income * 0.275 + 4057.50;
	    	else if(income > 65550 && income < 136750)
	    		tax = income * 0.305 + 14645.00;
	    	else if(income > 136750 && income < 297350)
	    		tax = income * 0.355 + 36361.00;
	    	else if(income > 297350)
	    		tax = income * 0.391 + 93374.00;
	    }else {
	    	if(income > 0 && income < 45200)
	    		tax = income * 0.15;
	    	else if(income > 45200 && income < 109250)
	    		tax = income * 0.275 + 6780.00;
	    	else if(income > 109250 && income < 166500)
	    		tax = income * 0.305 + 24393.75;
	    	else if(income > 166500 && income < 297350)
	    		tax = income * 0.355 + 41855.00;
	    	else if(income > 297350)
	    		tax = income * 0.391 + 88306.00;
	    }
	    
	    System.out.println("Your Federal tax = $ " + tax);
	    
	    
	    
	}
	
	

}
