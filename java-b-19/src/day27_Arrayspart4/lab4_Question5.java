package day27_Arrayspart4;

import java.util.Arrays;

public class lab4_Question5 {

	public static void main(String[] args) {
	
		int[] x = {1,2,3};
		
		System.out.println(Arrays.toString(rotateLeft(x)));
		
		

	}
public static int[] rotateLeft(int[]arr) {
	
	int x =arr[0];
	
	
	for(int i=0;i<arr.length-1;i++) {
		arr[i] = arr[i+1];
		}
	arr[arr.length-1]=x;
	return arr;
	
	
}
}
/*Question-5
 * Write a method that accepts an array and prints an array with the elements"rotated left”
 * int[] x = {1,2,3};  = > [2,3,1]
 * int[] y = {17,12,10,8}; = > [12,10,8,17]
 * int[] a = {7,0,0}; = > [0,0,7]
 * */
 