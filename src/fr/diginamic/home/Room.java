package fr.diginamic.home;

public abstract class Room {
	
	private double area;
	private int floor;
	
	public Room(double area, int floor) {
		if(area > 0 && floor >= 0) {
			this.area = area;
			this.floor = floor;
		} else {
			System.err.println("Dataset not valid");
		}
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}
	
}
