package day24_Arrays;

import java.util.Scanner;

public class task86_Months {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		String[]months=new String[12];
		months[0]="january";
		months[1]="february";
		months[2]="March";
		months[3]="April";
		months[4]="May";
		months[5]="june";
		months[6]="july";
		months[7]="Augustus";
		months[8]="september";
		months[9]="oktober";
		months[10]="november";
		months[11]="december";
		
		System.out.println("enter your month index number");
		int index=sc.nextInt();
		System.out.println("the month is : " + months[index]);
		
		
	}

}
