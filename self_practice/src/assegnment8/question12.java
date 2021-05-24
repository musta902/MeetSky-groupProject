package assegnment8;

import java.util.Scanner;

public class question12 {

	public static void main(String[] args) {
		
		//boolean b = hamletQuote();
		//System.out.println("result : " + b);
		
		System.out.println("result: "+theHamletQuote());
	
		

	}
     public static boolean theHamletQuote() {
    	 
    	 Scanner user_input = new Scanner(System.in);
 		System.out.println("Enter true or false 2 times: ");
 		boolean b1 = user_input.nextBoolean();
 		boolean b2 = user_input.nextBoolean();

 		if (b1 == false && b2 == false) {
 			return false;
 		} else {
 			return true;
    	 
     }
	
	
     }
}
/*The danish prince most famous quote is "to be or not to be". thats a classic example of boolean logic.

the hamletQuote method only returns true if one of or both of the boolean parameters is true.

example:

hamletQuote(true, false)
returns true

hamletQuote(false,true)
returns true

hamletQuote(true,true)
returns true

hamletQuote(false,false)
returns false

 

hint: use the truth table for this one, this can be done with one if and a logical operator.*/