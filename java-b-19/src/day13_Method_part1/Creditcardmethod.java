package day13_Method_part1;

public class Creditcardmethod {

	public static void main(String[] args) {
	
		double salary = 50000;
		int creditRating=5;
		
		if(salary>=20000 && creditRating>=7) {
			qualify();
			
		}else {
	       noQualify();
	       }
	       
	       
		}
		public static void noQualify() {
			System.out.println("I am sorry , you are not qualified for the cc ");
		}
		public static void qualify() {
			System.out.println("Congrat, you are qualified for the cc");
		
		
	}

}
