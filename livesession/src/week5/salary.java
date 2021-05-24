package week5;

public class salary {

	public double rate;
	public int weeklyHour;
	public double taxRate;
	
	public void setInfo(double hourlyRate, int numberOfHours, double tax ) {
		rate = hourlyRate;
		weeklyHour = numberOfHours;
		taxRate = tax;
	}  // to be able to initialize all instance variables of salary object
	
	public double Salary() {  // salary before tax
		return rate * weeklyHour * 52;  // annual salary
	}
	
	public double totalTax() {
		return Salary() * taxRate;  // total Tax
	}
	
	public double salaryAfterTax() { // returns the salary after tax
		return Salary() - totalTax();
	}

	
	public String toString() {  // allows us to print salary object
		return "Salary {rate= $" + rate 
				+ ", weeklyHour=" + weeklyHour 
				+ ", taxRate=" + taxRate  
				+", Salary=$"+ Salary()
				+", total tax=$"+ totalTax()
				+", salary after tax=$"+salaryAfterTax()+"}";
	}

	
	
	
	



/*
 Salary:
            attributes
                rate, weeklyHour, taxRate
                
            actions:
                setInfo(), salary(), totalTax(), salaryAfterTax(), toString()
 */
	}


