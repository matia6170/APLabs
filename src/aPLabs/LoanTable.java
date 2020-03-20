package aPLabs;

import java.util.Scanner;

public class LoanTable {

	public LoanTable() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param loan The amount of the loan (principal).
	 * @param yrs The number of years for the loan to be paid off.
	 * @param interest The annual interest rate of the loan.
	 * @return monthly payment (interest and principal paid)
	 */
	public double calculatePay(double loan, int yrs, double interest) {
		/*
		 * p = principal, amount borrowed
		 * k = monthly interest rate (annual rate/12.0)
		 * n = number of monthly payments (years * 12)
		 * c = (1 + k)n
		 * a = monthly payment (interest and principal paid)
		 */
		double p,k,n,c,a;
		//interest *=10;
		
		p = loan;
		k = interest/12.0;
		n = yrs * 12;
		c = Math.pow(1+k, n);
		
		a = (p*k*c)/(c-1);
		
		return a*10;
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		double interestLow,intersetHigh, loan;
		int yrs;
		
		System.out.print("Principal = $");
		loan = sc.nextDouble();
		System.out.print("Time = ");
		yrs = sc.nextInt();
		System.out.print("Low rate(in decimal) = ");
		interestLow = sc.nextDouble();
		System.out.print("High rate(in decimal) = ");
		intersetHigh = sc.nextDouble();
		
		/*
		loan = 10000;
		yrs = 30;
		interestLow = 0.11;
		intersetHigh = 0.12;
		intersetHigh+=0.0001;
		*/
		System.out.println("Annual Interest Rate\tMonthly Payment");
		for(double i = interestLow; i<intersetHigh; i+=0.0025 ) {
			
			System.out.printf("%10.5s%% %20.7s\n", String.valueOf(i*100),String.valueOf(calculatePay(loan, yrs, i)));
		}
		
	}

	
	public static void main(String[] args) {
		LoanTable lt = new LoanTable();
		lt.run();
		
	}

}
