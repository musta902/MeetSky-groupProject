package self_practice;

import java.util.Scanner;

public class replit {

	public static void main(String[] args) {
		String item1, item2, item3, report;
		   double price1, price2, price3, totalPrice;
		    Scanner scan=new Scanner(System.in);
		    System.out.println("Enter item and its price");
		     item1=scan.next();
		     price1=scan.nextDouble();
		     System.out.println("Enter item2 and its price");
		      item2=scan.next();
		     price2=scan.nextDouble();
		    System.out.println("Enter item3 and its price");
		     item3=scan.next();
		     price3=scan.nextDouble();

		    totalPrice=price1+price2+price3;
		    
		report="item1 : " + item1 + " price: " + price1 +" item2 :" + item2 + " price2: " + price2 + " item3: " + item3 + " price3: " + price3;
		System.out.println(report);
		System.out.println(totalPrice);


	}

}
