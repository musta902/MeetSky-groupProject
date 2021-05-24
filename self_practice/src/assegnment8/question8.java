package assegnment8;

import java.util.Scanner;

public class question8 {

	public static void main(String[] args) {
		int x= fib(0);
		System.out.print("output :" + x);
		

	}
   public static int fib(int sum) {
	   Scanner str=new Scanner(System.in);
	   System.out.print("Input: ");
	   int num=str.nextInt();
	   int num1=0;
	   int num2=1;
	   for (int i=1;i<=num-2;i++) {
		   sum = num1+num2;
		   num1=num2;
		   num2=sum;
		   
	   }
	
	   return sum;
	   
}
}
/*Complete a method fib() that will compute Fibonacci numbers
In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,……... 
The first two numbers of fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.

Input : 2
Output : 1

Input : 9
Output : 21*/