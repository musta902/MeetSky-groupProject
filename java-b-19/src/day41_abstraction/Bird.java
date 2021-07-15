package day41_abstraction;

public abstract class Bird extends Animal{
	


	@Override
	void eat() {
		System.out.println("Bird is eating");
		
	}
	
	/*
	@Override
	void breathe() {
		// TODO Auto-generated method stub
		
	}
	*/

	abstract void fly();
	

}
