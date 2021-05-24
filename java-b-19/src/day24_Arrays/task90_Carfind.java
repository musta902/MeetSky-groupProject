package day24_Arrays;

public class task90_Carfind {

	public static void main(String[] args) {
String[] cars = {"Toyota","Nissan","BMW","Mercedes","Honda"};
		
		boolean flag = false;
		
		for(int i=0;i<cars.length;i++) {
			
			
			if(cars[i].equals("Honda")) {
				
				flag=true;
				break;
			}
			
		}
		
		if(flag) {
			System.out.println("Found it");
		}else {
			System.out.println("Not found it ");
		}
		

	}

}
