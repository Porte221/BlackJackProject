//Create four different objects because you have four constructors

public class apples {
	
	public static void main (String [] args) {
//Create a tuna object with 0 arguements. Insert 3 arguements and display
	tuna tunaObject = new tuna(); 
	tuna tunaObject2 = new tuna(5);	//References constructor with 1 arguement
	tuna tunaObject3 = new tuna(5,13); //Creates an object with 2 arguements and references constructor with 2 arguements
	tuna tunaObject4 = new tuna(5,13,43); //References constructor with 3 arguements
	
	//Returns values of each object and calls the method to display the time
	System.out.printf("%s\n", tunaObject.toMilitary());
	System.out.printf("%s\n", tunaObject2.toMilitary());
	System.out.printf("%s\n", tunaObject3.toMilitary());
	System.out.printf("%s\n", tunaObject4.toMilitary());

	}
}
	
