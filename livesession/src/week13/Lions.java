package week13;

public class Lions extends Animal implements Hunt{
	
	public Lions() {
		super("Lion");
		
	}
	

	@Override
	public void eat() {
	
	}


	@Override
	public void hunting() {
		System.out.println(name+" is hunting ");
	}
	
	

}
