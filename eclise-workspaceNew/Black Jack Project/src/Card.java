
public class Card {

	
	/*
	 * @ 
	 */
	// private fields
	//Give every card a suit
	private Suit suit;
	//Give every card a rank
	private Rank rank;
	
	//Determines if card is face-up or not
	public boolean isFaceUp;
	
	//Constructor Method
	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
		isFaceUp = true; 
	}
	
	//Public methods
	public String getSuit() {
		//Print the suit of this card
		return suit.printSuit();
	}
	
	
	public String printRank() {

		//Mainly for aces
		return rank.printRank();
	}
	
	public int getRank() {
		//Return the rank of this card
		return rank.getRank();
	}
	
	public void flipCard() {
		isFaceUp = !isFaceUp;
	}


	
	//Override toString method
	public String toString() {
		String str = "";
		
			if (isFaceUp) {
				str += rank.printRank() + " of " + suit.printSuit();
			}
			else {
				str = " Card is face down";
			}
		
		return str;
	}
	
}
