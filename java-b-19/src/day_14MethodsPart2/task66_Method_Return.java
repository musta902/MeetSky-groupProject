package day_14MethodsPart2;

public class task66_Method_Return {

	public static void main(String[] args) {
		
	    double d = distance(40,5);
		
		System.out.println(d);
		if(d>500) {
			System.out.println("you spent too much gas");
		}else {
			System.out.println("you spent ok gas");
		}
		
	}

	
	public static double distance(double speed,int time) {
		double distanceTraveled=speed*time;
		return distanceTraveled;
		
	}
}
