package assegnment8;

import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		
		
		sign(0);
		
		
	}public static int sign(int num) {
			Scanner user_input=new Scanner(System.in);
			System.out.println("Enter a number");
			 num=user_input.nextInt();
			 if (num<1) {
			 System.out.println("-1");
			 }else if(num>0) {
				 System.out.println("1");
			 }else {
				 System.out.println("0");
				 
			
		}
			 return num;
		
		
	}

	
		


	
		
	}


/*Create a method called sign.  It gets a number and tells you if its positive, negative or zero.

for example :
sign(5) => 1
sign(-30)=> -1
sign(0) => 0

sign gets an int parameter.

print out 1,-1 or 0 depending on the input

the parameter should be entered by user (create a scanner object)*/