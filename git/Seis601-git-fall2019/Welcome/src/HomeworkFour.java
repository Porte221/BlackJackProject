/*** Xavier Porter
 *  601 - 01 Found of Software Dev.
 *  11/4/19
 *  
 *  Program: Ask the user to input a specific number of names he/she wants to input. Declare
 *  an array of this size. Prompt the user to enter names of the same size of the array. 
 *  Store these into a string array and print the names in uppercase. 
 * 
 */
import java.util.Arrays;
import java.util.Scanner;
public class HomeworkFour {

	public static void main (String [] args) {
		
	
		//Ask the user to specify the number of names to input
		Scanner input = new Scanner(System.in);
		System.out.println("How many names do you want to enter: " );
		
		//Declare the size of array based on user input
		int[] names = new int[input.nextInt()];
		
		//Create a string array and set to the number input by user
		String[] userNames = new String [names.length];
		
		String[] nameCap = userNames;
		
		//Traverse through array
			for(int i = 0; i < names.length; i++) {
				
				//Prompt user to enter the names and store them into an array called userNames
				System.out.println("Enter the names: " );
				 userNames[i] = input.next();
				 
				 //Capitalize each of the names
				 nameCap[i] = userNames[i].toUpperCase(); 
			}
			
			//Display the names the user entered
			 System.out.println(Arrays.toString(nameCap));
			
	}
}
	

