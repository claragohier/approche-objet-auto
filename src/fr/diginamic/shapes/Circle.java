package fr.diginamic.shapes;

public class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double calculateArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	public double calculatePerimeter() {
		return 2 * Math.PI * this.radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
