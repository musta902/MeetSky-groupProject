package stringSelfpractice;

import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	    System.out.print("Input");
	    String word1 = scan.next();
	    String word2 = scan.next();
	     System.out.print(reverse(word1,word2));




	    
	    
	    
	  }
	  
	  public static String reverse(String str1,String str2){
	    return str1+str2+str2+str1;

	  }

}
