package Assegnment10;

import java.util.Scanner;

public class question19_new {
/*/*Return the number of times that the string "java" appears anywhere in the given string word.

Sample Output:

     input: javaxjava
     output: 2

     input: javaxjavaapplepearjavaegg
     output: 3*/
	
		
		public static void main(String[] args) {
	        numberOfTimes();


	    }
	    public static void numberOfTimes() {

	        Scanner scan= new Scanner(System.in);
	        System.out.print("Enter a long word: ");
	        String word = scan.next();
	        System.out.print("Enter search term: ");
	        String searchTerm = scan.next();


	        int count = 0;
	        for (int i = 0; i < word.length() - searchTerm.length(); i++) {
	            if (word.substring(i, i + 4).equals(searchTerm)) {
	                count++;
	            }
	        }

	       System.out.println(count);

	    }
}