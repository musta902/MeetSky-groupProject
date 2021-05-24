package day27_Arrayspart4;

import java.util.Arrays;

public class lab4_Question9 {

	public static void main(String[] args) {

		int[] x = {1,2,3,6,7};
		
		System.out.println(Arrays.toString(makeLast(x)));
		

	}
	
	public static int[] makeLast(int[] arr) {
		
		int[] newArray = new int[2 * arr.length];
		
		
		newArray[newArray.length-1] = arr[arr.length-1];
		
		return newArray;
		
		
	}
	
	

}

/*Question-9
 * Write a method that accepts an array and prints a new array with double the length
 * where its last element is the same as the original array,
 * int[] x = {4,5,6};  = > [0,0,0,0,0,6]*/
 