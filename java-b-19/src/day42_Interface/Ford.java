package day42_Interface;

public class Ford extends ElectricCar{
	private int year;
	
	public Ford(String model, double price, String color,int year) {
		super(model, price, color);
		this.year=year;
		
	}

	@Override
	public void start() {
		System.out.println("ford -push start button to start");
		
	}

	@Override
	public void charge() {
		System.out.println("ford plugin to electric outlet");
		
	}

	@Override
	public void drive() {
		System.out.println("ford is driving..");
		
	}

	public int getYear() {
		return year;
	}

	



}
