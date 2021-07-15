package day40_accessmodifiers_final_hiding_2;

import day40_accessmodifiers_final_hiding.Car;


public class CarTest {



		public static void main(String[] args) {
			Car c = new Car();
			c.model = "m3";
			c.year = 2017;
			//c.door = 4;  //private 
			c.engine = 5.2;
			
			System.out.println(c.toString());
			
		
			

		
	}

}
