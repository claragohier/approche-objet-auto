package fr.diginamic.tests;
import fr.diginamic.home.*;

public class TestMaison {

	public static void main(String[] args) {
		
		Home home = new Home();
		Kitchen kitchen = new Kitchen(25, 1);
		LivingRoom livingRoom = new LivingRoom(45, 1);
		Bathroom bathroom = new Bathroom(17, 1);
		Bedroom bedroom = new Bedroom(20, 1);
		Bedroom bedroom2 = new Bedroom(34, 2);
		Bedroom bedroom3 = new Bedroom(28, 2);
		Bathroom bathroom2 = new Bathroom(22, 2);
		
		Kitchen kitchenError = new Kitchen(-25, 1);
	
		home.addRoom(kitchen);
		home.addRoom(livingRoom);
		home.addRoom(bathroom);
		home.addRoom(bedroom);
		home.addRoom(bedroom2);
		home.addRoom(bedroom3);
		home.addRoom(bathroom2);
		
		home.addRoom(kitchenError);
	
		System.out.println(home.getTotalArea());
		System.out.println(home.getFloorArea(1));
		System.out.println(home.getFloorArea(2));
		
		System.out.println("Bathrooms area : " + home.getRoomArea("Bathroom"));
		System.out.println("Bathrooms number : " + home.getRoomNumber("Bathroom"));
		System.out.println("Bedrooms number : " + home.getRoomNumber("Bedroom"));

	}

}
