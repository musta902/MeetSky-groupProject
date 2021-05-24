package Day29_lab4_conti;

public class question16 {

	public static void main(String[] args) {
		
		int[] x = {2,1,2,3,4};
		
		System.out.println(evenNum(x));
		
		

	}
 public static int evenNum(int[] str) {
	 
	int  counter=0;
	 
	 for(int i=0;i<str.length;i++) {
		 
	  if( i%2==0) {
		 
	  	 counter++;
		 
	 }
	 }	 
		 
	return counter;	 
	 
	 
	 
	 
 }
}
/*Question-16
 * Write a method that accepts an array and prints the number of even numbers in the array.
 * int[] x = {2,1,2,3,4} = > 3
 * int[] y = {2,2,0}  = > 3
 * int[] z= {1,3,5} = > 0*/
 