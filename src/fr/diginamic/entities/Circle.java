package fr.diginamic.entities;

/**
 * This class correspond to circle object
 * @author clarousse
 *
 */
public class Circle {

	private double radius;
	
	/**
	 * constructor circle
	 * @param radius
	 */
	public Circle(double radius){
		this.radius = radius;
	}
	
	/**
	 * circle perimeter
	 * @return
	 */
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	/**
	 * circle area
	 * @return
	 */
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	/**
	 * getter radius
	 * @return
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * setter radius
	 * @param radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

}
