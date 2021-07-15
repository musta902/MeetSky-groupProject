package day42_Interface;

public class Tesla extends ElectricCar {

	public Tesla(String model, double price, String color) {
		super(model, price, color);}
		

	@Override
	public void start() {
		System.out.println("Tesla starting quitly");
		System.out.println("Change the drive mode");
		
	}

	@Override
	public void charge() {
		System.out.println("Tesla charging plugin to electric outlet");
		
	}
		
	

	@Override
	public void drive() {
		
		System.out.println("Tesla driving");
		
	}
	

}
