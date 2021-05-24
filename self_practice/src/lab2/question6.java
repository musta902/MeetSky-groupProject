package lab2;

import java.util.Scanner;

/*Write a program that will ask the user to enter the amount of a purchase.
The program should then compute the state and county tax sales tax.
Assume the state sales tax is 4 percent and the county sales tax is 2 percent.
The program should display the amount of the purchase , the state sales tax, the county sales tax, the total sales tax, 
and the total of the sale (which is the sum of the amount of purchase plus the total sales tax)*/

public class question6 {

	
		
		public static void amountPurchase() {

			Scanner user_input = new Scanner(System.in);
			System.out.println("Enter amount of purchase : ");
			double amount = user_input.nextDouble();

			double stateTax = amount * 4 / 100;
			double countyTax = amount * 2 / 100;

			System.out.println("Amount of purchase is : $ " + amount);
			System.out.println("State sales tax is : $ " + stateTax);
			System.out.println("County sales tax is : $ " + countyTax);
			System.out.println("Total sales tax is : $ " + (stateTax + countyTax));
			System.out.println("Total amount of purchase is : $ " + (amount + stateTax + countyTax));

		
		

	}

}
