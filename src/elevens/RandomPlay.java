package elevens;

public class RandomPlay {
	
	private int[] myNums;

	public RandomPlay(int numInts) {
		// TODO Auto-generated constructor stub
		
		myNums = new int[numInts];
		
		for(int i = 0; i < myNums.length; i++) {
			myNums[i] = i;
		}
	}
	
	public String toString() {
		String r = "";
		
		for(int i = 0; i < myNums.length; i++) {
			r += myNums[i] + ", ";
		}
		
		return r.substring(0, r.length()-2);
	}
	
	public static void main(String[] args) {
		RandomPlay rp = new RandomPlay(8);
		
		System.out.println(rp);
	}

}
