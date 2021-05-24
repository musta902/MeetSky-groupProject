package Lab4_arraysQuestions;

import java.util.Arrays;

public class question5 {

	public static void main(String[] args) {
	int [] y = {17,12,10,8};
	
	rotate(y);
 System.out.println(Arrays.toString(rotate(y)));
	}
  public static int[] rotate(int[] arr) {
	  
	  int y=arr[0];
	for(int i=0;i<arr.length-1;i++) {
		arr[i] = arr[i+1];
		}
	arr[arr.length-1]=y;
	return arr;
	
	  
	  
	  
	  
	  
  }  
	  
  }

