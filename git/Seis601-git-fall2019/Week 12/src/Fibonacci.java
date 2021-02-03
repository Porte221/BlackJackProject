import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value for N: ");
		int userInput = input.nextInt();
		
		
		//int input=Integer.parseInt(args[0]);
		System.out.println("Fibonacci of " + userInput + " is " + fib(userInput));		
	}
	
	// Returns the Nth fibonacci number
	public static int fib(int N) {
		if (N == 0 || N == 1) {
			
			//To-Do: end case
			return 1; 
		} else {
			//To-Do: recursive part
			return fib(N - 1) + fib(N -2);
		}
		
	}


}
