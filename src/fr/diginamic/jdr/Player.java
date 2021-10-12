package fr.diginamic.jdr;

public class Player extends Perso {

	private int score;
	
	public Player(int strength, int lifePoint) {
		super(strength, lifePoint);
		this.score = 0;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
