package day4Arithmeticoperators;

import com.sun.jndi.url.dns.dnsURLContext;

public class wages {

	public static void main(String[] args) {
		//This program calculates hourly wages plus over time
		
		
		
		
		double regularWage; //The calculated regular wage
		double basePay=25;  //the base pay
		double regularHours=40; //The hours worked less over time
		double overTimeWages=37.5; //Overtime Pay rate
		double overTimehours=10;
		double totalWage; //Total Wage
		double overTimePay=37.5;
		
		regularWage=basePay*regularHours;
		overTimeWages= overTimePay*overTimehours;
		
		
		totalWage=regularWage+overTimeWages;
		
		System.out.println("Wages for this week are $ " + totalWage);
		
		
		
		
		
		}

}
