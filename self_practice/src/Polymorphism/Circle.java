package Polymorphism;

public class Circle extends Shape {
    
	public Circle() {
		super("circle",4);
	
	}

	@Override
	public void area() {
		System.out.println("area= "+ a*a);
		
	}

	@Override
	public void perimeter() {
		
		System.out.println("perimeter = "+ 4*a);
	}
	
	

}
