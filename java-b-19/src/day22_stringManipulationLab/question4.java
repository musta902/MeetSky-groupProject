package day22_stringManipulationLab;

public class question4 {/*Question-4
Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". 
firstTwo("Hello") → "He"firstTwo("abcdefg") → "ab"firstTwo("ab") → "ab"*/


	public static void main(String[] args) {
		System.out.println(firstTwo("Hello"));
		System.out.println(firstTwo("abcdefght"));
		System.out.println(firstTwo("ab"));
		System.out.println(firstTwo(""));
		System.out.println(firstTwo("a"));
		
	}
	
	public static String firstTwo(String str) {
		
		if(str.length()<2) {
			return str;
		}else if(str.isEmpty()) {
			return "";
		}else {
			return str.substring(0,2);
		}
		
		
		
	
	}

}
