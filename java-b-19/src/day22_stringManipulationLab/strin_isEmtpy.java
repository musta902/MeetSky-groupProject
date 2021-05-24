package day22_stringManipulationLab;

public class strin_isEmtpy {

	public static void main(String[] args) {
		
		String userName = "";
		String password = "";
		
		if(userName.isEmpty()) {
			System.out.println("Username field  can not be empty");
			
		}else {
			System.out.println("user name is not empty");
			
		}
		
		if (userName.isEmpty()|| password.isEmpty()) {
			System.out.println("Username or password can not be empty");
			
		}else {
			System.out.println("Username or password is not empty");
		}
			 

	}

}
