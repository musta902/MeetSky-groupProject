package day20_stringManupilationpart2;

public class string_index2 {

	public static void main(String[] args) {
		
		
		//index of with 2 values
		
		String list1 = "html-selenium-angular-jenkins-grid";
		
		int firstDash = list1.indexOf("-");
		System.out.println(firstDash);
		
		int secondDash = list1.indexOf("-", 5);
		System.out.println(secondDash);
		
		int thirdDash = list1.indexOf("-",secondDash+1);
		System.out.println(thirdDash);
		
		int lastDash = list1.lastIndexOf("-");
		System.out.println(lastDash);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
