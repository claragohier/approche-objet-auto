package fr.diginamic.home;

import java.util.Arrays;

public class Home {

	private Room[] home;
	private double sum;
	private double sumFloor;
	private double sumRoomFloor;
	private int sumRoomNumber;

	public Home() {
		this.home = new Room[0];
	}

	public void addRoom(Room room) {
		if (room != null) {
			home = Arrays.copyOf(home, home.length + 1);
			home[home.length - 1] = room;
		} else {
			System.err.println("The room with value 'null' is not conform");
		}
	}

	public double getTotalArea() {
		for (int i = 0; i < home.length; i++) {
			sum += home[i].getArea();
		}
		return sum;
	}

	public double getFloorArea(int floor) {
		sumFloor = 0;
		for (int i = 0; i < home.length; i++) {
			int homeFloor = home[i].getFloor();

			if (homeFloor == floor) {
				sumFloor += home[i].getArea();
			}
		}
		return sumFloor;
	}
	
	public double getRoomArea(String room) {
		sumRoomFloor = 0;
		for (int i = 0; i < home.length; i++) {
			String homeRoom = home[i].getClass().getSimpleName();

			if (homeRoom.equals(room)) {
				sumRoomFloor += home[i].getArea();
			}
		}
		return sumRoomFloor;
	}
	
	public int getRoomNumber(String room) {
		sumRoomNumber = 0;
		for (int i = 0; i < home.length; i++) {
			String homeRoom = home[i].getClass().getSimpleName();

			if (homeRoom.equals(room)) {
				sumRoomNumber += 1;
			}
		}
		return sumRoomNumber;
	}

	public Room[] getHome() {
		return home;
	}

	public void setHome(Room[] home) {
		this.home = home;
	}

}
