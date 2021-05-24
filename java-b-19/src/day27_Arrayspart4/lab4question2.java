package day27_Arrayspart4;

public class lab4question2 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {1,2,3,1};
		int[] z = {1,2,1};
		int[] k = {1};
		
		System.out.println(sameFirstLast(x));
		System.out.println(sameFirstLast(y));
		System.out.println(sameFirstLast(z));
		System.out.println(sameFirstLast(k));
			

	}
	
	public static String sameFirstLast(int[] arr) {
		
		if(!(arr.length>1)) {
			return "not a valid array";
		}
		
		if(arr[0] == arr[arr.length-1]) {
			return "true";
		}else {
			return "false";
		}
		
	}

}
/*Question-2
 * Write a method that accepts an array and check the length of the array first.
 * If the length is more than one, check if the first element and last elementare equal.
 *  if it is print true, if not print false.If the length is not more than 1, print not valid an array
 *  int[] x = {1,2,3}; = > false
 *  int[] y = {1,2,3,1}; = > true
 *  int[] z = {1,2,1}; = > true
 *  int[] k = {1}; = > not a valid array*/
