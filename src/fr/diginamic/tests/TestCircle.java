package fr.diginamic.tests;
import fr.diginamic.entities.Circle;
import fr.diginamic.utils.CircleFactory;

/**
 * This class allows to test the Circle class
 * @author clarousse
 *
 */
public class TestCircle {

	public static void main(String[] args) {

		/**
		 * Exercise Circle
		 */
		Circle circle = new Circle(5);
		Circle circle2 = new Circle(10.5);
		
		System.out.println("perimeter circle : " + circle.getPerimeter());
		System.out.println("aire circle : " + circle.getArea());
		System.out.println("perimeter circle2 : " + circle2.getPerimeter());
		System.out.println("aire circle2 : " + circle2.getArea());
		
		/**
		 * Exercise CircleFactory
		 */
		Circle circle3 = CircleFactory.createCircle(50);
		
	}

}
