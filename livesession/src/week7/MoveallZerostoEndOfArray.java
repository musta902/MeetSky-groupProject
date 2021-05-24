package week7;

import java.util.Arrays;

public class MoveallZerostoEndOfArray {

	public static void main(String[] args) {
	int[] array = {1,0,2,0,3,0,0,4,5,6,7};
		
		int[] newArray = new int[array.length];
		
		
		int i = 0; 
		for( int each : array ) {
			if(each !=0) {
				newArray[i++]=each;
			}
		}
	
		
		/*
		for(int i = 0, j=0 ; i < array.length; i++) {
			if(array[i] != 0 ) {
				newArray[j++]= array[i];
			}
		}
		*/
		
		
		System.out.println(Arrays.toString(newArray));
		
	}

}
