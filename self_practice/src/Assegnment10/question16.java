package Assegnment10;

public class question16 {

	public static void main(String[] args) {
		String str1="c#javaruby";
		
		String str2="java";
		
		if(str1.length()>=4) {
			if(str1.substring(0,4).equalsIgnoreCase(str2)||str1.substring(1, 5).equalsIgnoreCase(str2)) {
				System.out.println(true);
				
			}else {
				System.out.println("false");
			}
		}else {
			System.out.println("Invalid word");
		}
	}

}
/*Given a string word, print true if "java" appears starting at index 0 or 1 in the string, 
 * such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". 
 
 

Sample Output:
     input: javapython
     output: true

     input: cjavac++
     output: true

     input: c#javaruby
     output: false*/