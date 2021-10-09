package fr.diginamic.utils;
import fr.diginamic.entities.Circle;

/**
 * This class allows build of another class
 * @author clarousse
 *
 */
public class CircleFactory {

	public static Circle createCircle(double radius) {
		return new Circle(radius);
	}
	
}
