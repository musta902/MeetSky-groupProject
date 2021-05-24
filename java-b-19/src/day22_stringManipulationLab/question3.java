package day22_stringManipulationLab;

public class question3 {/*Question-3
Create a method return a new string made of 3 copies of the last 2 chars of the original string.
The string length will be at least 2.extraEnd("Hello") →
"lololo"extraEnd("ab") → "ababab"extraEnd("Hi") → "HiHiHi"*/



	public static void main(String[] args) {
		
		
		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("I am java"));
		System.out.println(extraEnd("a"));
		
	}
		
		public static String extraEnd(String str) {
			if(str.length()<2) {
				return "Invalid String";
				
			}
			String dummy = "";
			
			dummy = str.substring(str.length()-2);
			
			return dummy+dummy+dummy;
			
			
			
				
		}
		
	}


