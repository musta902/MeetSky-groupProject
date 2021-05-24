package day22_stringManipulationLab;

public class question10 {/*Question-10
Given a string, return true if the first 2 chars in the string
 also appear at the end of the string, such as with "edited".frontAgain("edited") → truefrontAgain("edit") → falsefrontAgain("ed") → true*/

	public static void main(String[] args) {
System.out.println(frontAgain("edited"));
		

	}
	
	public static boolean frontAgain(String str) {
		
		String first2 = str.substring(0,2);         //edited 
		String last2 = str.substring(str.length()-2);
		
		return first2.equals(last2);
		
		
		
	}

}
