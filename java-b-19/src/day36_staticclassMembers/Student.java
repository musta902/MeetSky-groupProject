package day36_staticclassMembers;

public class Student {
	String name;
	int age;
	int idNumber;
	static String school="Cybertek";
	public Student(String name, int age, int idNumber, String school) {
	
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
		this.school = school;
	}

	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", idNumber=" + idNumber + ", school=" + school + "]";
	}
	
	
		
		
	

	}


