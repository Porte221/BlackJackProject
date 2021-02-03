
/*
 * 	Follow a systematic number of steps until we find our correct solution.
 * 	Search for an array of speed for the smallest value. 
 */


public class practice {
	public static void main (String [] args) {
		
		double [] speed = {7.85, 7.32, 4.9, 6.22, 5.4, 7.3, 5.19};
		System.out.println(search(speed));
	}
	public static double search(double[] speed) {
		int size = speed.length; //Get the length of the array and store into size. Calculates the number of indexes in an array.
		double min = speed[0]; //Remembers the smallest index of an array. 
		
		//Count up to one all the one to the size. 
		for(int i = 1; i < size; i++) {
			if (speed[i] < min) {
				min = speed[i];
			}
		}
		return min;
	}
}
