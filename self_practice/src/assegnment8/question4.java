package assegnment8;

public class question4 {

	public static void main(String[] args) {
		
		
		int rows = 5;

		for (int i = 1; i <= rows; i++) {
			if (i == 1 || i == rows) {
				for (int j = 1; j <= 5; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= 5; j++) {
					if (j == 1 || j == 5) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					
				}
				System.out.println();
			}
			System.out.println();
		
		
		
		
		
		
		
		
		
		

	}

}
/*Create a method printHollowRect that prints a 5 on 5 hollow rectangle:




hint: you will need to use two nested for loops for that, 
and an if that checks if its the last or first iteration of the loop (so you will know whet to print "*" or " ")*/