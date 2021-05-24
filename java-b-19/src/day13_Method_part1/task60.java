package day13_Method_part1;

public class task60 {

	public static void main(String[] args) {
		
		
		calculator(6, 3, "+");
		calculator(6, 3, "-");
		calculator(6, 3, "*");
		calculator(6, 3, "/");

	}
	
	public static void calculator(int num1,int num2,String operator) {
		
		switch(operator) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		}
		
	}

}
