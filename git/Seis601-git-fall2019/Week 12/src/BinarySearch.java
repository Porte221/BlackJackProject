import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		int numArray[]={5,10,12,15,22,26,32,36,40,44,59,64,68};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to search for in the array: ");
		
		int target=input.nextInt();
		System.out.println("Index of "+target+" = "+binarySearch(numArray, target, 0, numArray.length));
	}
	
	/*
	 * Return the index of target in the array
	*/
	public static int binarySearch(int[] ary, int target, int start, int end){
		//get the middle index
		int middle = (end-start)/2 + start;
		int result = 0;
		
		//Some end cases (error, out of scope, etc)
		if(end-start<0||target<ary[0]||target>ary[ary.length-1])
			
			//If element is not in the array display 
			return -1;


		//Recursive case 1: If target is less than, the next search occurs within start and middle-1

		if (target < ary[middle]) {
			result = binarySearch(ary, target, start, middle-1 );
		}
		
		//Recursive case 2: If target is greater than, the next search occurs within middle+1 and end 
		else if(target > ary[middle]) {
			result = binarySearch(ary, target, middle+1, end);
		
		//End cases: If target is equal, done.
		}
		else if (target == ary[middle]) {
			result = middle;
		}

		//Return results
		return result;
	}
}
