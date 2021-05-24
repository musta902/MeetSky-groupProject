package day18;

import java.util.Scanner;

public class tas73_GuesssinGame {

	public static void main(String[] args) {
       int secretNumber=8;
       int userInput;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number:");
		
		
		do {
			
			userInput=sc.nextInt();
			
			if(userInput<secretNumber) {
				System.out.print("Enter a bigger number:");
			}else if(userInput>secretNumber) {
				System.out.print("Enter a smaller number:");
			}else {
				System.out.print("Congrat you got it...");
			}
			
		}while(userInput != secretNumber);
				
		
		


	}

}
