package experiments;

public class StringExp {

	public StringExp() {
		// TODO Auto-generated constructor stub
	}
	
	public String firstNameLast(String name) {
		int commaPos = name.indexOf(", ");
		String last = name.substring(0,commaPos);
		String first = name.substring(commaPos+2);
		
		
		return first + " " + last;
	}
	
	public static void main(String[] args) {
		StringExp joe = new StringExp();
		
		//System.out.println(joe.firstNameLast("38, 43"));
		System.out.println(joe.RecursiondaVinci("you are retarded", 10));
	}
		
	

	public String daVinci(String toReverse) {
		String reversed = "";
		for(int i = toReverse.length(); i>0; i--) {
			//reversed += toReverse.charAt(i-1);
			reversed += toReverse.substring(i-1,i);
		}
		return reversed;
	}
	
	String r = "";
	public String RecursiondaVinci(String toReverse, int i) {
		int count = toReverse.length();
		int j = i;
		
		if(count == 0) {
			return r;

		}
		if(count>0) {
			toReverse.substring(count-1,count);
			r +=  RecursiondaVinci(toReverse, j-1); 
		}
		return r;
	
	}
	
	
	
	
}
	/*
	public static void main(String[] args) {
		StringExp retard = new StringExp();
		
		String bob = "shut up";
		String sally;
		
		System.out.println("bob is: \"" + bob + "\" bob is " 
				+ bob.length() + " characters long");
		
		sally = bob;
		
		System.out.println("bob is: \"" + bob + "\" bob is " 
				+ bob.length() + " characters long");
		
		System.out.println("sally is: \"" + sally + "\" sally is " 
				+ sally.length() + " characters long");
		
		bob = "shappell";
		sally = "ok";
		
		System.out.println("bob is: \"" + bob + "\" bob is " 
				+ bob.length() + " characters long");
		
		System.out.println("sally is: \"" + sally + "\" sally is " 
				+ sally.length() + " characters long");
	}
*/

