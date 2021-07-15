package Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

import week13.Animal;
import week13.Dog;
import week13.Dolphin;
import week13.Eagle;
import week13.Lions;

public class ShapeTest {

	public static void main(String[] args) {
		Shape obj1 = new Square();
		obj1.area();
		obj1.name
		Shape obj2 = new Circle();
		
		Shape obj3 = new Cube();
		
		
		Shape obj4 = new Cylinder();
		
		
		

		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.addAll(Arrays.asList(
				new Square(),
				new Circle(),
				new Cube(),
				new Cylinder()
				));
		

	}
	

}
