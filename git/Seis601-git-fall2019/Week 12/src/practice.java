
public class practice {
	public static void main (String [] args) {

		float[] name = {1, 2, 3};
	
		System.out.println(Question(name));
	}
	
	public static double Question(float[] array)  {

        double sum = 0;

        for(int i = 0; i < array.length; i++)

                sum += array[i];
    	System.out.println("Array length is" + array.length);

System.out.println("Sum is"+ sum);
        return (double) sum/array.length;

}
		
	
}
