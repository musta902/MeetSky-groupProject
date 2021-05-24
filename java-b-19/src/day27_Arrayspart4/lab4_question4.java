package day27_Arrayspart4;

public class lab4_question4 {

	public static void main(String[] args) {
		
		
		
	int[] x= {1,2,3};
	int[]y= {-4,2,0};
	int[] z = {7,0,0}; 
    int[] a = {3,-2,10,4}; 
	
	sum(y);
	sum(z);
	sum(a);
	int n=sum(x);
		System.out.println(n);// or we can directly
		System.out.println(sum(y));// we can direct print with sum(y)or(sumx)
		System.out.println(sum(z));
		System.out.println(sum(a));
		System.out.println(sum(x));
		
		//sum1=sum(x)+sum(y)+sum(z)+sum(a); not work try agin
		//System.out.println(sum1);

	}
  public static int sum(int[]arr) {
	  
	  int sum=0;
	  
	  for(int value:arr) {
		  
		  sum=sum+value;
		  
		  
		 }
	  return sum;
	  
	  
	  
  }
}
/*Question-4
 * Write a method that accepts an array and prints the sum of all elements in the array
 * int[] x = {1,2,3}; = > 6
 * int[] y = {5,11,2}; = > 18
 * int[] z = {7,0,0}; = > 7
 * int[] a = {3,-2,10,4}; = > 15
 */