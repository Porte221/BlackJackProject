
public class LongestName {

	public static void main (String [] args) {
		String [] names = {"anja", "Kimberli", "Edmond", "Shenna", "Apolonia", "Caroll", "Heike"};
		System.out.println(longestName(names));
	}
	
	public static String longestName(String []names) {
		//Identify size of array
		int size = names.length;
		String longestName = names[0];
		for(int i = 0 ; i < size ; i++) {
			
			//Compare the length of each cell to the longest name found. 
			//Comparing length of string to longest name.length is larger, update to the longestName. 
			if( names[i].length() >= longestName.length()) {
				longestName = names[i];
			}
		}
		
		return longestName;
	}
}
