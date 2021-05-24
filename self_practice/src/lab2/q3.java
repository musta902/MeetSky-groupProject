package lab2;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		/*Write a program that asks the user for a positive nonzero integer value. 
		The program should use a loop to get the sum of all the integers from 1 up to the number entered.*/
		
		Scanner user_input=new Scanner(System.in);
		
		System.out.println("enter for a positive nonzero integer value: ");
		
		int number=user_input.nextInt();
		int totaal=0;
				
		for(int i=1;i<number;i++) {
			
			totaal=totaal+i;
			
			
			
		}
		
		System.out.println(totaal);
			
		}
		
		
		
		
	
		
	}


