package day24_Arrays;

import java.util.Scanner;

public class task87_days {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
    
		String[] days = new String[7];
		days[0]="Monday";
		days[1]="Tuesday";
		days[2]="wednesday";
		days[3]="thursday";				
	    days[4]="vriday";
		days[5]="saturday";
		days[6]="sunday";		
				
		System.out.println("Enter your index: ");
		int index =sc.nextInt();
		System.out.println("Tha day is " + days[index]);
		
		

	}

}
