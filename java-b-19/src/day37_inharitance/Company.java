package day37_inharitance;

public class Company {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		emp1.name = "Tom";
		emp1.jobTitle = "SDET";
		emp1.age = 27;
		emp1.gender = "M";
		emp1.work();
		 
		emp1.eat("salad");
		//emp1.attendClass();
		//emp1 can have everything from person class whatever inside the Employee class
		
		
	}

}
