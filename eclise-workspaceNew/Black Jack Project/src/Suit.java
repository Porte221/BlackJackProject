//Public so other card classes have access to suit
public enum Suit {
	
	//Enumerate members of suit, since they have 4
	HEARTS("Hearts"), DIAMONDS("Diamonds"), CLUBS("Clubs"), SPADES("Spades");
	
	//To set the values in enumeration, unique to java to create classes in enum
	
	private final String suitText;
	
	
	//Constructor in enum
	private Suit(String suitText){
		
		//Represents each member of suit
		this.suitText= suitText;
	}
	
	//Public method
	public String printSuit() {
		return suitText;
	}
}