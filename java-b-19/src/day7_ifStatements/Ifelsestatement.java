package day7_ifStatements;

public class Ifelsestatement {

	public static void main(String[] args) {
		
		int score=60;// 60 is fail
		
		if (score>=70) {                              
			
			
			System.out.println("Excellent");
			System.out.println("You passed with grade A");
			

	} else { System.out.println("You failed");
	
	
	}
		int sales,bonus;
	    double commisionRate,salary;
	
	   sales=5200;
	   salary=10000;
	
	
	    if(sales>5000) {
		bonus=500;
		commisionRate=1.12;
		
		
	    }else {
	    	bonus=100;
	    	commisionRate=1.10;
	    }
		
		salary=salary*commisionRate+bonus;
		
	System.out.println("Slary = " + salary );
	
		
		
		
		
		
		
		
		
	}

}
