package day37_inharitance;

public class Employee extends Person{
	
	String jobTitle;
	
	public void work() {
		
		System.out.println(name + "is working " + jobTitle);
		
	}

	
	public String toString() {
		return "Employee [jobTitle=" + jobTitle + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

	
}
