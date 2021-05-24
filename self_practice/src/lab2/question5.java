package lab2;

import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		System.out.print("Enter your meal charge amount: ");
		
		double chargeMeal=user_input.nextDouble();
		
		double tax= chargeMeal*6.75/100;
		double tip= ((chargeMeal+tax)*20)/100;
		double total=chargeMeal+tax+tip;
		
		System.out.println("Meal Charge is : $ " + chargeMeal);
		System.out.println("Tax is : " + tax);
		System.out.println("Tip amount is : $ " + tip);
		System.out.println("Total Bill is : $ " + total);
		
		
				
				
		
		
		
		
		
		
		
		
	}

}
/*Write a program that computes the tax and tip on a restaurant bill. 
The program should ask the user to enter the charge for the meal. 
The tax should be 6.75 percent of the meal charge. The tip should be 20 p
ercent of the total after adding tax. Display the meal charge, tax amount, tip amount, and total bill on the screen.*/