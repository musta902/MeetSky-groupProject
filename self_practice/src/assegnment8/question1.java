package assegnment8;

import java.util.Scanner;

public class question1 {

	
	public static void main(String[] args) {
	//plus();
		System.out.println(plus(10,15));
	}
	public static boolean plus(int num1,int num2) {
		//Scanner user_input1=new Scanner(System.in);
		//System.out.println("enter the firt number" );
		
		
		//int num1=user_input1.nextInt();
		
		//System.out.println("enter the second number" );
		 //int num2=user_input1.nextInt();
		 
		 //System.out.println("num1+num2= "+ (num1+num2));
		 return num1+num2>0; 
	}
	
    
}
/*	
Question-1

Create a method called "plus", its return is void and it gets no arguments.

It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within the plus method.

Example:

enter first number:
1
enter second number:
2
result: 3*/