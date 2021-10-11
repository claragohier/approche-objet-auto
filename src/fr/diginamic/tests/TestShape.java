package fr.diginamic.tests;
import fr.diginamic.shapes.*;

/**
 * This class is used for test the Shape class and display's method
 * @author clarousse
 *
 */
public class TestShape {

	public static void main(String[] args) {

		Circle circle = new Circle(5);
		Rectangle rectangle = new Rectangle(5,2);
		Square square = new Square(5);
		
		DisplayShape.display(circle);
		DisplayShape.display(rectangle);
		DisplayShape.display(square);
	}

}
