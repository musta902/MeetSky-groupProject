package assegnment8;

import java.util.Scanner;

public class question2 {
        
	
	
	
	public static void main(String[] args) {
		
		cube();

	}

	public static void cube() {
		
		Scanner user_input = new Scanner (System.in);
		System.out.print("input:");
		int num = user_input.nextInt();
		num = num*num*num;
		System.out.println("output: " + num);
		
		return;
		
		
		
	

	
		
	}

}
/*Question-2

Create a method called cube. 
Write all required code inside this method in order to ask the user for a number and then prints the cubed value of that number:

Example:

input: 5
output: 125*/