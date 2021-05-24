package day27_Arrayspart4;

import java.util.Arrays;

public class lab4_question6 {

	public static void main(String[] args) {
		
int[] x = {1,20,3,0,0,0,0,0,0,0,125};
		
		System.out.println(Arrays.toString(maxEnd(x)));

	}
	
	public static int[] maxEnd(int[] arr) {
		
		int max = arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i+1]>max) {
				
				max = arr[i+1];
				
				
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i] = max;// after i found the max value,i should the change each element to max array
		}
		
		return arr;
}

	
	
	
}
/*Question-6
 * Write a method that accepts an array and figure out which is greatest element in the array, a and set all the other elements to be that value.
 *  Print the changed array.
 *  int[] x = {1,2,3}; = > [3,3,3]
 *  int[] y = {11,5,9}; = > [11,11,11]
 *  int[] a = {110,5,98,0,1200,11,-4}; = > [1200,1200,1200,1200,1200,1200,1200]*/
