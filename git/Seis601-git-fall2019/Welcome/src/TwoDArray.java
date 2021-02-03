
public class TwoDArray {

	public static void main (String [] args) {
		
	}
	
	public static double englishAverage(int [][] grades) {
		int total = 0;
		for(int i = 0; i < 5 ; i++) {
			// Go through all students in english array.
			total += grades[1][i];
			
		}
		double average = total/5.0;
		
		return average;
	}
}
