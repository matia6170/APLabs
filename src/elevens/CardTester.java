package elevens;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card bobCard = new Card("Stinky", "bold", 10);
		Card retardedCard = new Card("Retard", "bruh", 4338);
		Card notBobCard = new Card("Stinky", "bold", 10);
		
		System.out.println("Bob's points = "+ bobCard.pointValue());
		System.out.println("Bob's Suit = "+ bobCard.rank());
		System.out.println("Bob's Rank = "+ bobCard.suit());
		System.out.println(bobCard);
		
		System.out.println(bobCard.matches(notBobCard));
		System.out.println(bobCard.matches(retardedCard));
		
		
	}
}
