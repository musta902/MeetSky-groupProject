package day18;

import java.util.Scanner;

public class task72_SumNumbers {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first numbers:");
		int num1=sc.nextInt();
		System.out.println("enter second number " );
		int num2=sc.nextInt();
		System.out.println("Enter third number");
		int num3=sc.nextInt();
		
		int sum=num1+num2+num3;//18
		System.out.println("Sum of numbers:" + sum);
}
}