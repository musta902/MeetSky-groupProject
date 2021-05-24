package Day29_lab4_conti;

public class question18 {

	public static void main(String[] args) {

		int[] x = {1,2,2,1,3,13,3};
		
		int sum = 0;
		
		for(int i=0;i<x.length;i++) {
			
			if(x[i] != 13) {
				sum=sum+x[i];
			}else {
				break;
				
			}
		}
		
		System.out.println(sum);

	}

}
/*Question-18
 * Write a function that accepts an array and prints the sum of the numbers in the array.
 * Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count
 * int[] x = {1,2,2,1} = > 6
 * int[] y = {1,1}  = > 2
 * int[] a = {1,2,2,1,13} = > 6
 * int[] b = {1,2,2,1,13,3} = > 6*/
 