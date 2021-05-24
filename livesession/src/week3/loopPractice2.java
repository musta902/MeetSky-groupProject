package week3;

public class loopPractice2 {

	public static void main(String[] args) {
		
		//0 2 4 6..1000
		for(int i = 0;i<=1000;i+=2) {
			System.out.print(i + " ");
			
		}
		
		System.out.println("\n------------------------------------------");
		//1 3 5 7...999
		System.out.println("Odd numbers");
		for (int i = 1;i<1000;i+=2) {
			System.out.print(i + " ");
			
			
		}
		System.out.println("\n------------------------------------------");
		
		for(int i=0;i<=100;i++) {//1 2 3 4   1000
			if(i%2==0) {
				System.out.print(i + " ");
				
				
			}
		}
		
		
		
		
		
		
		
	}

}
/*:
1. write a program that can print all even numbers between 0 ~ 1000
2. write a program that can print all odd numbers between 0 ~ 1000
3. write a program that can print a~z
4. write a program that can print A~Z
5. write a program that can print z~a
6. write a program that can print Z~A*/