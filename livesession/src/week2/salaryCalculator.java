package week2;

public class salaryCalculator {

	public static void main(String[] args) {
		
		int hourlyRate = 50;//dolars per hour
		double taxRate = 0.3;
		int weeklyHour = 40;//dolars per weeklyhour
		
		//annual salary before tax
		
		int salary =(50*40)*48;
		System.out.println("Your salary is: $" + salary); 
		 //total tax
		double totalTax= salary*taxRate;
		System.out.println("your total tax is: $" + totalTax );
		
		//salaryaftertax
		
		double salaryAfterTax=salary-totalTax;
		System.out.println("your after tax is: $" + salaryAfterTax);
		
		//eachmonth slary 
		
		double eachMonth= salaryAfterTax/12;
		System.out.println("Each month salary is: $" +  eachMonth);
		
		
		
		
	}

}

//write a program that can calculate the tax, salary & salary after tax based on 
//the hourly rate & tax rate
//               ex:
 //                      rate = 50;
   //                   taxRate = 0.3;  
     //                 weeklyHours = 40;
       //           then output will be:
         //                 your salary is: 96000 USD
           //               your total tax is: 28800 USD
            //              your income after tax is: 67200 USD
             // Assume that a year has 48 weeks (excluding PTO)



