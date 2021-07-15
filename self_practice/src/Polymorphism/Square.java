package Polymorphism;

public class Square extends Shape {
    
	
	public Square(String name,int a) {
		super("Square");
		
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
