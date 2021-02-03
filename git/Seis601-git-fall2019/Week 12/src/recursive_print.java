
public class recursive_print {

	public static void main(String[] args) {
		int array[] = {2,5,5,5,4};
		
		System.out.println("Printed by for-loop");
		//print the array using a for loop
		for (int i=array.length-1; i>=0; i--) {
			System.out.print(array[i]);
		}

		System.out.println("");
		System.out.println("Printed by recursive_print");
		//print the array using a recursive way.
		//call the method recursive_print. 
		recursive_print(array, array.length-1);
	}

	//A recursive method "recursive_print"
	//array: the int array to be printed
	//i: the current index of the element to be printed
	public static void recursive_print(int[] array, int i) {
		//To-Do: Step 1. Check condition. Stop or continue the recursive call?
		//Condition to continue: if i>=0 
		if (){
			//To-Do: Step 3. Recursive calls: do what you need to do in an iteration (print element i). update the condition (i-1) and call itself 
		}else{
			//To-Do: Step 2. End case: no more recursive calls. Just return.
		}
	}
	
}
