
public class mystery1 {

	public static void main(String[] args) {
		System.out.println(mystery1(4));
	}
	
	public static int mystery1(int N) {
		if (N == 1) {
			return 1;
		} else {
			//System.out.println(N);

			return N + mystery1(N-1);
		}
	}
}
