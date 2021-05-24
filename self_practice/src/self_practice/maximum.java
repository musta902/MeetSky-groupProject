package self_practice;

import java.util.Scanner;

public class maximum {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter a number");
	
		int max=0;
		
		while(true) {
			
			int num2=num.nextInt();
		
			if(num2>max) {
				max=num2;
				
			}
			System.out.println("if continue yes otherwise no");
	       Scanner str=new Scanner(System.in);
			String con=str.next();
			if(con.equalsIgnoreCase("yes")) {
				continue;
			}else if (con.equalsIgnoreCase("no")){
				break;
			}else {
				
				System.out.println("Invalid input");
			break;
				
		}
	
		}
		System.out.println(max);

		
		
		
		
	}

}
