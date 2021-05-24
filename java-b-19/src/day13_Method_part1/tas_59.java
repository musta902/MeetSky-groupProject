package day13_Method_part1;

public class tas_59 {

	public static void main(String[] args) {
		
		payCalculator(80,20);
		payCalculator(37,62.5);
		
		
	}

	public static void payCalculator (double hours,double hourlyPay) {
		double pay = hours*hourlyPay;
		
		System.out.println(pay);
	}
	
}
