package self_practice;

public class assisment5 {

	public static void main(String[] args) {
		
		

		

		    
		
		
	/*	Question-5

		Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

		-Declare int variables inputSeconds, hours, minutes, seconds
		-Initialize the inputSeconds

		-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
		-Assign values to the hours, minutes, seconds variables
		-Display the result

		       Sample Output:

		       inputSecond is 3695  
		       1 hours, 1 minutes, and 35 seconds */
		       
		
		int inputSeconds=100000;
		int hours=inputSeconds/(60*60);
		int minutes=hours%60;
		int seconds=inputSeconds%60;
		
		System.out.println(hours + " hours " + minutes + " minutes " + seconds + "seconds");
		
		
		
				
		
		
		       

	}

}
