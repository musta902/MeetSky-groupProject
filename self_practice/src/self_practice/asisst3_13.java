package self_practice;

public class asisst3_13 {

	public static void main(String[] args) {
		
		int start=1;
		int sum=0;
		do {
			if(start%2==0) {
				start++;
				
			}
			sum+=start;
			
		}while(++start<=10);
		System.out.println(sum);// 36 
		
		

	}

}
