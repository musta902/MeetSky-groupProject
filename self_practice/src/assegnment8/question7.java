package assegnment8;

import java.util.Scanner;

public class question7 {
	
	public static void main(String[] args) {
		
		Scanner str=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = str.nextInt();
		str.close();
		
		
		
		}
     public static boolean is Palindrome() {
    	 int num = number;  // changing original number to a reversed version 
 		int isNum = 0;
 		while (num != 0) {
 			int remainder = num % 10;
 			isNum = isNum * 10 + remainder;
 			num = num / 10;
 		}
 		if (isNum == number) { // checking if original number is equal to reversed number
 			return true;
 		} else {
 			return false;
    	 
    	 
    	 
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
/*Complete a method isPalindrome() that will check if the number is a palindrome. Print your result as a boolean (true or false).
Do not convert int into a string!
Example:
input: 1001
output: true

Example:
input: 1234
output: false*/