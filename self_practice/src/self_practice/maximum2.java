package self_practice;

import java.util.Scanner;

public class maximum2 {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		
	
		int max=0;
		
		while(true) {
			System.out.println("Enter a number");
			int num1=num.nextInt();
			System.out.println("Enter another number");
			int num2=num.nextInt();
			
		
			 max = (num1>num2) ? num1 : (num2>num1) ? num2 : num1; 
			 
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
