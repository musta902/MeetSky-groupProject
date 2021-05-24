package day10_controlflowstatements;

public class task44 {

	public static void main(String[] args) {
		 //constants
		final int STARTING_KPH=60;
		final int MAX_KPH=130;
		final int INCREMENT=10;
		
		//VARIABLES
		int kph;//TO HOLFD TO SPEED in KPH
		double mph;//to hold to speed in mhp
		System.out.println("KPH\t\tMPH");
		System.out.println("----------------------");
		
		
		
        for(kph=STARTING_KPH;kph<=MAX_KPH;kph+=INCREMENT) {
        	
        	
        	mph=kph*0.6214;
        	System.out.println(kph + "\t\t "+ mph);
        			
        }
	}

}
