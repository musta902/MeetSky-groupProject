package day42_Interface;

public class ElectricCarTest {

	public static void main(String[] args) {
	//	ElectricCar ec = new ElectricCar;// Error we can not create object from abstract class instantieted
		
		Tesla modelS =new Tesla("model S",4500,"Grey");
		modelS.charge();
		modelS.drive();
		modelS.start();
		modelS.stop();
		System.out.println("---------------");
		
		Ford fusion = new Ford("Fusion",35000,"Black",2017);
		fusion.charge();
		fusion.drive();
		fusion.start();
		fusion.stop();
		
		System.out.println("---------------");
		
		TeslaSemi semi = new TeslaSemi("Semi",50000,"Brown",3.5);
		semi.charge();
		semi.start();
		semi.load("oranges");
		semi.drive();
		semi.stop();
		
		System.out.println("---------------");
		
		TeslaTruck tr = new TeslaTruck("CybertekTruck",100000,"white",6.0);
		tr.charge();
		tr.start();
		tr.load("javabooks");
		tr.drive();
		tr.stop();
	
		System.out.println("---------------");
		
		
		System.out.println(modelS.toString());
		System.out.println(fusion.toString());
		System.out.println(tr.toString());
		
		
		
	}

}
