
public class mystery2 {

	public static void main(String[] args) {
		String str = "Hello";
		int x = mystery2(str);
		System.out.println(x);
	}
	
	public static int mystery2(String s) {
		if (s.equals("")) {
			return 0;
		} else {
			return 1 + mystery2(s.substring(1));
		}
	}
}
