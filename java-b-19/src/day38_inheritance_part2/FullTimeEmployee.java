package day38_inheritance_part2;

public class FullTimeEmployee extends Employee {
  @Override
	public void calculatePay(int hours,double rate) {
	
	double total=(hours*rate)*1.05;
	System.out.println("FullEmployee total pay: " + total);
	

	
	}
}
