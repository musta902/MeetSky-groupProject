package Assegnment10;

public class question25 {

	public static void main(String[] args) {
		
		String sc1="12345";
		String sc2="abcdef";
		String dummy="";
		
		
		
	for(int i=0;i<sc1.length();i++) {
		dummy=dummy+sc1.charAt(i)+sc2.charAt(i);
		
	}
 
	  System.out.println(dummy + sc2.substring(sc1.length(),sc2.length()));
	  
	  
	  
	  
	} 
}
/*When gears merge and work together, one tooth from each one goes in order.
Write a method mergeStrings that will return the strings merged, one letter at a time, starting with one. Please note one and two can be of different lengths. Please look at below examples:

     s1 ==> "12345"
     s2 ==> "abcde"
     mergeStrings(s1,s2) ==> "1a2b3c4d5e"

     mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

     mergeStrings("java", "selenium") ==> "jsaevlaenium"*/