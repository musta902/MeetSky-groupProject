package day13_Method_part1;

public class task61 {

	public static void main(String[] args) {
		
		ageCalculator(2019, 1965);
		ageCalculator(2019, 1875);
		

	}
	
	public static void ageCalculator(int currentYear,int birthyear) {
		
		int age = currentYear - birthyear;
		
		System.out.println(age);	
		
	}

	
	
	
	
	
}

