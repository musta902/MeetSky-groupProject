package day4Arithmeticoperators;

public class contribution {

	public static void main(String[] args) {
		
		
		//this program calculated amount of pay that will be contributed to a retirement
		//plan if 5%,8%or 10% of monthly pay is withled.
		//variables to hold the montly pay and the amount of the contribution
		
		double monthlyPay = 6000;
		double contribution;
		//calculate and display 5% contribution
		
		contribution =monthlyPay*0.05;
		System.out.println("5 percent is $ "+contribution + " per month");
		
		//Calculate and display 8% contribution
		contribution=monthlyPay*0.08;
		System.out.println("8 percent is $ "+contribution + " per month");
		
		//10%
		
	     contribution=monthlyPay*0.08;
	     System.out.println("10 percent is $ "+contribution + " per month");
	     
	     System.out.println(" ");
		
		
		
		
		
	}

}
