package fr.diginamic.tests;
import fr.diginamic.shapes.Shape;

/**
 * This class allows display of perimeter and area of the shape
 * @author clarousse
 *
 */
public class DisplayShape {

	public static void display(Shape shape) {
		System.out.println("Area : " + shape.calculateArea());
		System.out.println("Perimeter : " + shape.calculatePerimeter());
	}
}
