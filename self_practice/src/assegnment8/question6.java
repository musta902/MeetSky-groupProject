package assegnment8;

import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {
		
		
		
		
		
		
		next3(0);
		
		
		
	}
   
	public static int next3(int num) {
		Scanner user_input=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=user_input.nextInt();
		System.out.println("next 3 are: ");
		System.out.print((num+1) + " " + (num+2) + " " + (num+3));
		
		
		
		
		
		
		return num;
		
		
	}
	
	
	
}
/*Create a method called next3 . 
 * This method gets an int argument and prints the next 3 numbers after that number.
 
 *  Call the method from main method and pass num to it.
 enter number
1
next 3 are:
2 3 4

(put a space between numbers)*/