package day27_Arrayspart4;

public class lab4_question3 {

	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		int[] b = {7,3};
		
		System.out.println(commonEnd(a, b));

	}
	
	public static String commonEnd(int[] x, int[] y) {
		
		if(!(x.length>1)) {
			return "Array 1 is not valid";
		}
		if(!(y.length>1)) {
			return "Array 2 is not valid";
		}
		
		
		if(x[0]==y[0] || x[x.length-1]==y[y.length-1]) {
			return "true";
		}else {
			return "false";
		}
		
	}

}
/*Question-3
 * Write a method that accepts 2 arrays and checks the lengths of the arrays first.
 * If lengths are more than 1, it prints true if the arrays have the same first elementor they have the same last element.
 * If the length of the array is not more than 1, it prints the "array1 is not a validarray " or "array2 is not a valid array"
 * int[] x = {1,2,3};  = >true
 * int[] y = {7,3};
 * int[] x1 = {1,2,3}; = >false
 * int[] y1= {7,3,2};
 * int[] x2 = {1,2,3}; = > true
 * int[] y2= {1,3};
 * int[] x3 = {1}; = > Array1 is not validint[] y3= {7,3};*/
