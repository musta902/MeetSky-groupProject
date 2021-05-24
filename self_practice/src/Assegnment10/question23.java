package Assegnment10;

public class question23 {

	public static void main(String[] args) {
String str = "xxbreadbutterbread";
		
		int counter = 0;
		
		for(int i=0; i<str.length()-4; i++) {
			if(str.substring(i,i+5).contentEquals("bread")) {
				counter++;
			}		
		}	
		if(counter == 2) {
			str = str.substring(str.indexOf("bread")+5, str.lastIndexOf("bread"));
			System.out.println(str);
		}else {
			System.out.println("nothing");
		}
		
		
       
	}

}
/*A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.

Sample Output:

     input: breadjambread
     output: jam

     input: xxbreadjambreadyy
     output: jam

     input: xxbreadapple
     output: nothing

     input: breadbutterbread
     output: butter*/