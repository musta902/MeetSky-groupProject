package assegnment8;

import java.util.Scanner;

public class question10 {

	public static void main(String[] args) {
		
		
		System.out.println(isEven());
		

	}
	public static boolean isEven() {
		
			Scanner user_input=new Scanner(System.in);
			System.out.println("enter a value = ");
			
			int x=user_input.nextInt();

			if (x % 2 == 0) {
				return true;
			} else {
				return false;
			
		}
			
			
		
	}

}
/*isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.

for example:

isEven(1) --> false

isEven(8) --> true*/