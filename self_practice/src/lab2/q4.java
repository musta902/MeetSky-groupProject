package lab2;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		
		/*Write a program that asks user for the number of males and the number of females registered in a class. 
		The program should display the percentage of males and females in the class.*/
		
		Scanner percentage=new Scanner(System.in);
		
		System.out.println("enter a female number ");
		
		int femaleNumber=percentage.nextInt();
		System.out.println("enter mail number ");
		int maleNumber=percentage.nextInt();
		int femalePercentage=(femaleNumber*100)/(femaleNumber+maleNumber);
		int malePercentage=(maleNumber*100)/(femaleNumber+maleNumber);
		
		System.out.println("the percentage of males=" + malePercentage);
		System.out.println("the percentage of females= " +femalePercentage );
		
		
		
		
		
	}

}
