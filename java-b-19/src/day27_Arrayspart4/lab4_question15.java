package day27_Arrayspart4;

import java.util.Arrays;

public class lab4_question15 {

	public static void main(String[] args) {

		int[] x = {8,6,7,9,5};
		
		System.out.println(Arrays.toString(swapEnds(x)));
		
		
	}
	
	
	public static int[] swapEnds(int[] arr) {
		
	
		int temp = 0;
		temp = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = temp;
		
		return arr;

	}

}
/*Question-15
 * Write a method that accepts an array and swap the first and last element in the array.
 * Print the modified array
 * int[] x = {1,2,3,4} = > [4,2,3,1]
 * int[] y = {1,2,3}  = > [3,2,1]
 * int[] z= {8,6,7,9,5} = > [5,6,7,9,8]*/
 