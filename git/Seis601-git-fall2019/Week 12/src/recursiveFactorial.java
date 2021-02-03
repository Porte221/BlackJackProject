
public class recursiveFactorial {

	public static void main(String[] args) {
		int fac_num = 4;
		int fac_result = factorial(fac_num);
		int fac_result_by_recursion = recursiveFactorial(fac_num);
		System.out.println("factorial " + fac_num + " by loop: "+fac_result);
		System.out.println("factorial " + fac_num + " by recursion: "+fac_result_by_recursion);
	}
	/** 
	 * Computes N factorial, N!
	 * @precondition N > 0
	 * @param N the factorial number to compute
	 * @return int N!
	 */
	public static int factorial(int N) {
		int product = 1;
		while (N > 1) {
			product *= N;
		    N--;
		}
		return product;
	}
	
	public static int recursiveFactorial(int N) {
		//To-Do: Step 1. Check condition. Stop or continue the recursive call?
		//Condition to stop: if N == 1
		
		if (N == 1) { //Condition to stop recursive
			return N; //End the case or no more recursive calls, just return N.
		}else {
			return N * recursiveFactorial(N-1);//To-Do: Step 3. Recursive calls: do what you need to do in an iteration (multiply N with the factorial of N-1).
		}
	}
}
