package day27_Arrayspart4;

import java.util.Arrays;

public class lab4_question13 {

	public static void main(String[] args) {
		 int[] x = {5,6};
		 int[] y = {3,4};  
		 biggest1(x,y);

	}
   public static void biggest1(int[] arr1,int[] arr2) {
	   
	   int sum1=0;
	   int sum2=0;
	   
	   for(int value:arr1) {
		   sum1=sum1+value;
		   
	  } for(int value:arr2) {
		   sum2=sum2+value;
		   
	   }
	if(sum1>sum2) {
		System.out.println(Arrays.toString(arr1));
		
	}else if(sum2>sum1) {
		System.out.println(Arrays.toString(arr2));
		
	}else {
		System.out.println("Equal");
	}
	
	
	
}
	
	
	
}
/*Question-13
 * Write a method that accepts 2 arrays and consider the sum of the values in each array.
 * Print the array which has the largest sum. In event of a tie, print "equal"
 * int[] x = {1,2}   
 *  int[]y={3,4}  = > [3,4]
 *  int[] x = {5,6}    
 *  int[] y = {3,8}  = > equal 
 *  int[] x = {1,1}  
 *  int[] y = {1,0}  = > [1,1]*/
 