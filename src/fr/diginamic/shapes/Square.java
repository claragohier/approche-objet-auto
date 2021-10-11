package fr.diginamic.shapes;

public class Square extends Shape {

	private double length;

	public Square(double length) {
		this.length = length;
	}

	public double calculateArea() {
		return this.length * this.length;
	}

	public double calculatePerimeter() {
		return 4 * this.length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

}
