
import java.util.*;


public class Deck extends Hand{

	Random rand = new Random();

	//Populate Deck
	public void populate() {
		
		
		//Loop through all suits
		//For each suit add a card for every rank
		/* For suit in suits 
		 * 	For rank in Ranks
		 * 	Set card to card with a rank & suit
		 * 	Call cards.add with card class
		 *  End 
		 *  End
		 * 
		 */
		
		//Picks the first suit, then it goes into the rank of each suit
		for (Suit suit: Suit.values()) {
			for (Rank rank: Rank.values()) {
				Card card = new Card(rank, suit);
				card.flipCard(); // flip card when added to get it
				this.addCard(card); // all elements in hand
			
			}
			
					
		}
	
	}
	
	//Shuffle Deck
	public void shuffle() {
		
		//Traverse cards in deck
		for (int i = cards.size() - 1; i > 0; i --) {
			
			//Swap a random card between the beginning and last card of deck
			//Pick a random card from 0 and i (51) the last card of deck.
			int pick = rand.nextInt(i);
			
		
			//Pick a random card by returning random element at list
			Card randCard = cards.get(pick);
			
			
			//Pick random card at end of list
			Card lastCard = cards.get(i);
			
		
			//Reset the deck
			//Put random card at end
			cards.set(i, randCard);
			
			//put the last card, where random card was
			cards.set(pick, lastCard);
		
		}
	}

	//Deal method, to hand

	public void deal(Hand hand, int perHand) {
		//Deal to a single hand
		for (int i = 0; i < perHand; i++) {
			//Pull off top of deck and give to hand
				this.give(cards.get(0), hand);
			}
		}
	
	
	//Flip a card method
	public void flipCard(Card c) {
		c.flipCard();
	}
	
	
	}
	




