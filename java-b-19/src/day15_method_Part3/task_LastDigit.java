package day15_method_Part3;

public class task_LastDigit {

	public static void main(String[] args) {
		
    if(lastDigit(7,17)) {
    	System.out.println("They have the same last digit");
    }else {
    	System.out.println("They do not have the same last night");
    }
		
	}

	public static boolean lastDigit(int num1,int num2) {
		if ((num1%10)==(num2%10)) {
			return true;
		}else {
			return false;
			
		}
	}
	
}
