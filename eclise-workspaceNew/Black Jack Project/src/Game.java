
import java.util.Scanner;

public class Game {
	public static void main (String[] args) {
		

		//Initialize a deck
		Scanner input = new Scanner(System.in);
		Deck deck1 = new Deck();
		
		//Add cards to Deck
		deck1.populate();
		
		//Shuffle Deck
		deck1.shuffle();
		
		//Create playing hands for dealer and player
		Hand player, dealer;
		player = new Hand();
		dealer = new Hand();
		Hand[] hands = {player};


		//Flip players 2 cards
		
		//Show value of player 2 cards
		
		//When player are finished hitting
		boolean playerDone = false;
		boolean dealerDone = false;
		
		String answer;
	
		//Prompt user for when they want to hit or stand
		
		while(!playerDone || !dealerDone) {
			//Deal 2 cards to player 
			deck1.deal(player, 2);
			
			//Deal 2 cards to dealer
			deck1.deal(dealer, 2);
			
			//Show player hand
			//loop through hands
			for(int i = 0; i < hands.length; i ++) {
				//flip players cards
				hands[i].flipCards();
				System.out.println(hands[i].showHand());
			}
			
			//Flip dealers first card (Showing value)
			dealer.cards.get(0).flipCard();
			System.out.println("Dealer's Cards\n" + dealer.showHand());
			
			
			//Player's turn
			if(!playerDone) {
				System.out.print("Hit or stay? (Enter H or S):");
				answer = input.next();
				System.out.println();
				
				
				//Player hits
				if(answer.compareToIgnoreCase("H") == 0) {
					//If player hits, add next card in deck to hand
					//store whether player is busted.
				
					 deck1.deal(player, 1);
					 
					
					System.out.println("Player hits!");
					player.cards.get(0);
						player.cards.get(2).flipCard();
						
						System.out.println(player.showHand());		
			
				}
				else {
					System.out.println("Player stays");
					System.out.println(player.showHand());
					playerDone = true;

					
				}
			}
			
			//Dealers turn
			if(!dealerDone) {
				//If dealer's value is less than 17, hit
				if(dealer.getTotal() < 17) {
					System.out.println("The dealer hits\n");
					dealer.cards.get(1).flipCard();
				
					deck1.deal(dealer, 1);
					dealer.cards.get(2).flipCard();
					
					System.out.println("Dealer's Cards\n" + dealer.showHand());
				}
				else {

					System.out.println("Dealer stays:");
					
					dealer.cards.get(1).flipCard();
					System.out.println("Dealer hand:\n" + dealer.showHand());
					dealerDone = true;
				}
			}
	
			
			System.out.println();
			
			//variables
			int playerSum = player.getTotal();
			int dealerSum = dealer.getTotal();
			int score = 0;
			int wins = 0;
			int losses =0;
			
			if(playerSum > dealerSum && playerSum <=21 || dealerSum >21) {
				System.out.println("You Win");
				wins = wins + 1;
			}
			else {
				System.out.println("Dealer Wins");
				losses = losses - 1;
				
			}
			
			System.out.print("Would you like to play again? (Y/N)" );
			answer = input.next();
			String play = "Y";
			if(answer.equals(play)) {
				player.clear();
				dealer.clear();
				
				playerDone=false;
				
				
				
			}
			
			
				else {
					input.close();
					System.out.println("Thanks for playing, your score:");
					System.out.println("Wins:" + wins);
					System.out.println("Losses:" + losses);
					break;
				}

			System.out.println();
		}
		
	
		

	}

		
		
}


		
	
			


		
		

