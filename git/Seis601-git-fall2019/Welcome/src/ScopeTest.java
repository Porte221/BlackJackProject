/*	The scope of a variable describes the region of a program the variable can be 
 *  referred to by name. 
 * 
 */
public class ScopeTest {
	public static void print(int count) {
		System.out.println(count);
	}
	
	public static void main(String [] args) {
		
		for (int count = 0; count < 3 ; count++) {
			System.out.println(count);
		}
		
		int count = 10;
		System.out.println(count);
		print(40);
		System.out.println(count);
	}
}
