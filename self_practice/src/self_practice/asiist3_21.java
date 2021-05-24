package self_practice;

public class asiist3_21 {

	public static void main(String[] args) {
		int c=0;
		boolean flag=true;
		for(int i=0;i<8;i++) {
			while(flag) {
				c++;
				if(i>c||c>3) {//true olmassi lazim
					flag=false;
					
				}
				
			}
		}
		
		System.out.println(c);

	}

}
