package Day29_lab4_conti;

public class question20 {

	public static void main(String[] args) {
		int[] a = {1,2,2} ;
		System.out.println(search2(a));

	}
   public static boolean search2(int[]arr){
	   
	 
	    for(int i=0;i<arr.length-1;i++) {
	    	if (arr[i]==2 && arr[i+1]==2) {
	    		return true;
	    	}else {
	    		
	    	}
	    	
	    }
	    return false;
	    
   }
	
  
}
/*Question-20
 * Write a method that accepts an array and prints true
 *  if the array contains a 2 next to a 2 somewhere.
 *  int[] x = {1,2,2} = > true
 *  int[] y = {1, 2, 1,2}  = > false
 *  int[] a = {2,1,2} = > false
 *  int[] b = {2,2,1,2} = > true*/
