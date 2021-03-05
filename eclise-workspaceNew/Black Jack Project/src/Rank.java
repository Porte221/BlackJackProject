
//Use to compute game and value of cards
public enum Rank {
	
//Enumerate Rank of cards
//Constant with Integer value
	
	
	ACE(1, "Ace"), //Assign initial value to ace (Remember to change to 11 in other class)
	TWO(2, " 2"),
	THREE(3, "3"), 
	FOUR(4, "4"),
	FIVE(5, "5"),
	SIX(6, "6"),
	SEVEN(7, "7"),
	EIGHT(8, "8"),
	NINE(9, "9"),
	TEN(10, "10"),
	JACK(10, "Jack"),
	QUEEN(10, "Queen"),
	KING(10, "King");
	
	//Private field
	private final int rankValue;
	private final String rankString;
	
	//Constructor
	private Rank(int rankValue, String rankString) {
		//refer to class rank, each item
		this.rankValue = rankValue;
		this.rankString = rankString;
	}
	
	//Public method as int, return rankValue
	public int getRank() {
		return rankValue;
	}
	
	public String printRank() {
		return rankString;
	}
}