/** Xavier Porter
 *  601 - 01 Found of Software Dev.
 *  11/19/19
 *  
 *  Program: Write a recursive program that calculates m to the Nth power. Instead of iteratively
 *  m * n, you will compute the result recursively by performing successive multiplication operations.
 *  
 *  This program contains the numbers m and n from the user and
 *  recursively (m * (n-1)) displays the result.
 * 
 * 
 */

import java.util.Scanner;
public class Recursive {

	public static void main (String [] args) {
		
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user
		System.out.print("Enter a value for m: ");
		int m = input.nextInt();
		
		//Prompt the user
		System.out.print("Enter a value for n: ");
		int n = input.nextInt();
		
		//Display the results and call the method
		System.out.println(mToTheNth(m,n));
	}
	
	//Create a recursive method for factorial numbers
	public static int mToTheNth(int m, int n) {
		if (n == 0) {
			int result = 1;
			return result;
		}
		else {
		
		//compute and return the result
		return m * mToTheNth(m, n-1);
		}
	}
}
