package day22_stringManipulationLab;
/*Question-1
 * Create a method that accepts 1 string, e.g. "Bob", 
 * return a greeting of the form "Hello Bob!".helloName("Bob") →
 * "Hello Bob!"helloName("Alice") → "Hello Alice!"helloName("X") → "Hello X!"*/
public class question1 {

	public static void main(String[] args) {
		System.out.println(helloName("Bob"));
		System.out.println(helloName("Alice"));
		System.out.println(helloName("X"));
		
	}

	public static String helloName(String str) {
		return "Hello ".concat(str).concat(str).concat("!");
		
		
	}
	
	
}
