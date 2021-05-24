package week2;

public class UnaryOperators {

	public static void main(String[] args) {
		
		System.out.println(-10 - 3);//-13
		System.out.println(+10-3);//7
		
		int a = 20;
		
		System.out.println(a++);//post:passes current value==>20
		System.out.println(a); //post:after passing current value then changes the value by ==>21

		int b =100;
		System.out.println(b--);//100
		System.out.println(b); //99
		
		int a2=5;
		a2=a2--;
		//a2=5;
		System.out.println(a2);
		
		
	}

}
