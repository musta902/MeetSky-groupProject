package Assegnment10;

public class question26 {

	public static void main(String[] args) {
		
		String word="java";
		uniqueChars(word);
		
		System.out.println(uniqueChars(word));
	}

	
	public static String uniqueChars(String x) {
		
		String str="";
		
	     char current;
	     
	     for (int i=0;i<x.length();i++) {
	    	 
	    	 current=x.charAt(i);
	    	 if (str.indexOf(current)<0) {
	    		 str=str+current;
	    		 
	    	 }
	    	
	     }
		
		
		
	     return str;
		
		
	}
	
	
	
	
}
/*uniqueChars is a method that you will code now, should be able to accept any string in the word and return unique characters from the parameter.

Sample Output:

     uniqueChars("java") ==> "jav"

     uniqueChars("mama") ==> "ma"

     uniqueChars("spoon") ==> "spon"*/