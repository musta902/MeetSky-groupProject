package day20_stringManupilationpart2;

public class Task80 {

	public static void main(String[] args) {
		
		checkedString("Your order confirmation number is xyz","confirmation");
		
		
	}
public static void checkedString(String str1,String str2) {
	if(str1.contains(str2)) {
		System.out.println(str1.indexOf(str2));
	}else {System.out.println("Not found");
}
	
	
}
}