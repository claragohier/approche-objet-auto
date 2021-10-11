package fr.diginamic.tests;
import fr.diginamic.entities.Theater;

public class TestTheater {

	public static void main(String[] args) {

		Theater theater = new Theater("Toto", 20, 15, 30);
		
		theater.register(3, 2);
		theater.register(2, 2);
		theater.register(3, 2);

		System.out.println("Registred clients : " + theater.getClients());
		System.out.println("Recipe total : " + theater.getRecipe());

	}

}
