
import java.util.ArrayList;

public class Hand {

	//Create and declare a set of cards
	protected ArrayList<Card> cards;
	
	//Constructor to set value
	public Hand() {
		//Create a new hand will begin with a list of nothing
		cards = new ArrayList<Card>();
	}
	
	//Clear cards from hand
	public void clear() {
		cards.clear();
	}
	
	//Add cards to hand or Hit
	public void addCard(Card card) {
		cards.add(card);
		
	}
	
	//Don't take an additional card
	public void stand() {
		
	}
	
	
	public String showHand() {

		String show = "";
	//Show cards and their total points only if all cards are FaceUp
		boolean allFaceUp = true; 
		
		//Loop through hand for every card, add to string
		for(Card c: cards) {
			
			show += c.toString() + "\n";
			
			//Only change if one of cards is not faceup
			if(!c.isFaceUp) {
				allFaceUp = false;
			}
			
		}
		
		if (allFaceUp) {
			show += " Total points = " + getTotal() + "\n";
		}
		//Loop through all cards, and if facedown, set to false
		
		
		
		return show;
	}
	
	//Flip all of player cards
	public void flipCards() {
		//Loop through cards , for every card
		   for(Card c: cards) {
			   c.flipCard();
		   
		}
	}
	
	
	//Give card, what card and whose hand
	public boolean give(Card card, Hand otherHand) {
		
		//If we don't have card, return false
		if(!cards.contains(card)) {
			return false;
		}
		else {
			// get index position of card
			cards.remove(card);
			otherHand.addCard(card);
			return true;
		}
	}
	
	//Return total point value of cards in a hand
	public int getTotal() {
		
		// Initialize variables
		int totalPoints = 0;
		
		boolean hasAce = false;
		
		//Loop through cards
		// get total points
		//check for aces
		
		for (int i = 0; i < cards.size(); i++) {
			
			totalPoints += cards.get(i).getRank();
			
			//check for aces
			if (cards.get(i).printRank() == "Ace") {
				hasAce = true;
			}
			//Make ace worth 11 if total points are less than or equal to 11
			if(hasAce && totalPoints <= 11) {
				
				//Add 10 more to the Ace
				totalPoints += 10;
				
			}
		}
		
		
		return totalPoints;
	}
	
}