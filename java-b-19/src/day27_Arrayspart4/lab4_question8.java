package day27_Arrayspart4;

public class lab4_question8 {

	public static void main(String[] args) {
		
		int[] x= {4,5};
		
		System.out.println(real(x));

	}
    public static boolean real(int[] num) {
    	
    	for(int i=0;i<num.length;i++) {
    		if (num[i]==2||num[i]==3) {
    			return true;
    			
    		
    			}
    		
    	} 
    	
    	return false;
		
    	
    }
    	
	
	
	
}
/*Question-8
 * Write a method that accepts an array and prints true if it contains a 2 or a 3
 * int[] x = {2,5};  = > true
 * int[] y = {4,3};  = > true
 * int[] z = {4,5};  = > false*/
 