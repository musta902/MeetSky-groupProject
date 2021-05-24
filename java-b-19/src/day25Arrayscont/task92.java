package day25Arrayscont;

import java.util.Arrays;

public class task92 {

	public static void main(String[] args) {
	
		
		int[]  numbers = new int[10];
		
		
		for(int i=0;i<numbers.length;i++) {
			
			numbers[i] = i+1;
		}
		
		for(int i=0;i<numbers.length;i++) {
			
			System.out.println(numbers[i] * 19);
		}
		
		System.out.println(Arrays.toString(numbers));
		
		
		
		

	}

}
/*Task-92
 * Write a Java program to store numbers 1 to 10 in an array using data instantiation.
 *  Then write a for loop to multiply each member of above array by 19, this way you will get table of 19 stored in the above array. 
 *  Finally write another for loop to print all the array elements. 
 * ØYou should get the following output:1938577695114133152171190*/
 