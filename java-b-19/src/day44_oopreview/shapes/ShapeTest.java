package day44_oopreview.shapes;

public class ShapeTest {

	public static void main(String[] args) {
		//create 4 Shape, using polymorpism
		Shape square = new Diamond();
		
		Shape diamond = new Diamond();
		
		Object shapeObject = new Shape();
		
		square.draw();
		diamond.draw();
		
		((Square)square).squareMethod();
		
		

	}

}
