package day_26ArrayPart3;

import java.util.Scanner;

public class methodArrays2 {

	public static void main(String[] args) {
		
		System.out.println(findCar(3,"Honda"));//true
			
	}

public static String[] createArray(int arraySize) {
	Scanner user_input=new Scanner(System.in);
	String[] carArray=new String [arraySize];
	
for(int i =0;i<carArray.length;i++) {
	
System.out.println("Enter a car # " + (i+1));
	
	carArray[i]=user_input.next();
	
}
        return carArray;
    
   }
	public static boolean findCar(int value,String toFindCar) {
		for(String car :createArray(value)) {
			
			if(car.equalsIgnoreCase(toFindCar)) {
				
			}
			return true;
			
		}
		
	return false;
	
	
}	




}
//createArray will accept one parameter which is carSize
	//user will enter some cars
	//findcar method -will accept 2 parameters which 1-int value,tofindCar
	//if car is found -return true
	//if not return false