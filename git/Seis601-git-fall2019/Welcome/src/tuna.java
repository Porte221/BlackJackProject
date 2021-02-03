
public class tuna {
	private int hour;
	private int minute;
	private int second;

	//Create constructor for 0 arguements
	public tuna() {
		this(0,0,0);
	}
	
	public tuna(int h) {
		this(h,0,0);
	}
	
	public tuna(int h, int m) {
		this(h,m,0);
	}
	
	public tuna(int h, int m, int s) {
		setTime(h,m,s);
	}
	
	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	//Build set hour, minutes and seconds method
	
	public void setHour(int h) {
		//Conditional expression ? = if true, assign h. : = else, assign 0.
		hour = ((h>=0 && h <24) ?h:0);
	}
	
	public void setMinute(int m) {
		minute = ((m>=0 && m <60) ?m:0);

	}
	//Create a set method to change if data is bad
	public void setSecond(int s) {
		second = ((s>=0 && s <60) ?s:0);

	}
	//Create get methods to assign that data
	
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	
	//The last method needed is a formatting method, that displays the information
	
	public String toMilitary(){
		//Values will display 2 decimal places, return value of methods
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
}
