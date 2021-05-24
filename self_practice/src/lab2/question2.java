package lab2;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		/*Question-2

		A bag of cookies holds 40 cookies. The calorie information on 
		the bag claims that there are 10 serving in the bag 
		and that a serving equals 300 calories. write a program 
		that lets the user enter the number of cookies he or she actually
		ate and then reports the number of total calories consumed.*/
		
		//one bag=40 cookies
		//one bag=300 calorie
		//each cookie=300/40
		//each cookie=7.5 calorie
		
		double each_cookies=7.5;
		
		
		
		Scanner user_input=new Scanner(System.in);
		
		System.out.println("Enter the ate of cookies number:");
		
		double ateOfcookies = user_input.nextDouble();
		System.out.println("the number of total calories consumed is :" + (ateOfcookies*each_cookies));
		
		
		
		
		
		
		
		
		
		
	}

}
