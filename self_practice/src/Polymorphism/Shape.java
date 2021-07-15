package Polymorphism;

public abstract class Shape {
	public String name;
	public int a;
	
	
	public Shape(String name,int a) {
		this.name=name;
		this.a=a;
	}
	
	public abstract void  area();
	
	public abstract void perimeter();
	

}
