package aPLabs;

public class RomanNumerals {

	public RomanNumerals() {
		// TODO Auto-generated constructor stub
	}
	
	public static String intToRomanNumerals(int input) {
		String ret;
		String[] numbs = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
		
		if(input > 10) {
		
		return numbs[input];
	}
	
	public static void main(String[] args) {
		System.out.println(RomanNumerals.intToRomanNumerals(9));
	}

}
