package assegnment8;

import java.util.Scanner;

public class question14 {

	public static void main(String[] args) {
		
		boolean result=truthTable(false);
		System.out.println("result is : " + result);
		
		
	}

	
		
	

	public static boolean truthTable(boolean b) {
		
		Scanner user_input=new Scanner(System.in);
		
		System.out.println("Enter 3 times for result: ");
		boolean input1 = user_input.nextBoolean();
		boolean input2 = user_input.nextBoolean();
		boolean input3 = user_input.nextBoolean();
		if(input1==true && input2==true && input3==true) {
			return true;
			
		}else {
			return false;
			
		}
		
	}
}
/*This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.

https://en.wikipedia.org/wiki/Truth_table*/