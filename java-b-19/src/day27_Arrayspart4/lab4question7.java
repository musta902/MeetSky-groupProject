package day27_Arrayspart4;

import java.util.Arrays;

public class lab4question7 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {};

		System.out.println(Arrays.toString(makeEnds(x, y)));
		

	}
	public static int[] makeEnds(int[] arr1,int[] arr2) {
		
		arr2= new int[2];
		arr2[0]=arr1[0];
		arr2[1]=arr1[arr1.length-1];
		
		return arr2;
		
		
		
		
		
		
	}

}
/*Question-7
 * Write a method that accepts 2 arrays and prints the second array containing the first and last elements from the first array.
 * int[] x = {1,2,3};                  //arr1
 * int[] y = {};              = > [1,3]//arr2
 * int[] a = {7,4,6,2};
 * int[] b = {};               = > [7,2]*/
 