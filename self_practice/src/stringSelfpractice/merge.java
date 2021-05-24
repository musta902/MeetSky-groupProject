package stringSelfpractice;

import java.util.Scanner;

public class merge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Input: ");
	    String word1 = scan.next();
	    String word2 = scan.next();

	    String dummy="";
	    if(word1.length()!=3 || word2.length()!=3){
	    	
		     System.out.println("cannot merge");
		     }else {
	  for(int i=0;i<word1.length();i++){
	    dummy=dummy+word1.charAt(i)+word2.charAt(i);

	  }
	     }
	  System.out.println(dummy);

	}

}
