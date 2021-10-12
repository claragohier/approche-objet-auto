package fr.diginamic.jdr;

import java.util.Scanner;

import fr.diginamic.jdr.*;

public class Game {

	public static void main(String[] args) {

		boolean perso = true;
		boolean game = true;
		
		// Player
		int strength = (int) (Math.random() * (18 - 12) + 12);
		int lifePoint = (int)(Math.random() * (50 - 20) + 20);
		Player player = new Player(strength, lifePoint);
		
		// Player2
		int lifePoint2;
		Perso player2; 

		// Wolf
		int strengthW = (int) (Math.random() * (8 - 3) + 3);
		int lifePointW = (int)(Math.random() * (10 - 5) + 5);
		Wolf wolf = new Wolf(strengthW, lifePointW);

		// Gobelins
		int strengthG = (int) (Math.random() * (10 - 5) + 5);
		int lifePointG = (int)(Math.random() * (15 - 10) + 10);
		Gobelins gobelins = new Gobelins(strengthG, lifePointG);

		// Troll
		int strengthT = (int) (Math.random() * (15 - 10) + 10);
		int lifePointT = (int) (Math.random() * (30 - 20) + 20);
		Troll troll = new Troll(strengthG, lifePointG);
		
		// Fight
		int attackScore1 = 0;
		int attackScore2 = 0;
		int damage = 0;

		while(game == true) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Choose an option : \n 1. Create a player \n 2. Fight at creature");
			int option = scanner.nextInt();
		
			if (option == 1) {
				player = new Player(strength, lifePoint);
				
			} else if (option == 2) {
				Scanner scanner2 = new Scanner(System.in);
				System.out.println("Choose a creature : \n 1. Wolf \n 2. Gobelins \n 3. Troll");
				int optionC = scanner2.nextInt();

				if(optionC == 1) {
					player2 = wolf;
				} else if(optionC == 2) {
					player2 = gobelins;
				} else if(optionC == 3) {
					player2 = troll;
				} else {
					player2 = null;
					System.err.println("Error");
				}
				
				while(player.getLifePoint() > 0) {
					if(perso == true) {
						attackScore1 = player.attack();
						perso = false;
					} else {
						attackScore2 = wolf.attack();
						perso = true;
					}
					System.out.println("Player life point : " + player2.getLifePoint());
					System.out.println("Creature life point : " + player2.getLifePoint());
					System.out.println("attackPlayer : " + attackScore1 + " / attackCreature : " +  attackScore2);
					if(attackScore1 > attackScore2) {
						damage = attackScore1 - attackScore2;
						lifePoint2 = player2.getLifePoint() - damage;
						System.out.println(lifePoint2);
						player2.setLifePoint(lifePoint2);
					} else if(attackScore2 > attackScore1) {
						damage = attackScore2 - attackScore1;
						lifePoint = player.getLifePoint() - damage;
						player.setLifePoint(lifePoint);
					}
					
					if(player2.getLifePoint() <= 0) {
						String type = player2.getClass().getSimpleName();
						System.out.println(type);
						if(type.equals("Wolf")) {
							player.setScore(player.getScore() + 1);
						} else if(type.equals("Gobelins")) {
							player.setScore(player.getScore() + 2);
						} else if(type.equals("Troll")) {
							player.setScore(player.getScore() + 5);
						}
						System.out.println("Player win with score : " + player.getScore());
						break;
					}
				}
				if(player.getLifePoint() <= 0) {
					System.err.println("Your character is deceased. \n"
							+ "He got the score of X points. \n"
							+ "Please create a new character ");
				}
				
			} else {
				System.err.println("Illegal option");
				Scanner scanner3 = new Scanner(System.in);
				System.out.println("Choose an option : 'n\' 1. Create a player 'n\' 2. Fight at creature");
				option = scanner3.nextInt();
			}
		}
		
	}

}
