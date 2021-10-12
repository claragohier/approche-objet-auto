package fr.diginamic.jdr;

public abstract class Perso {

	// instance attributes
	private int strength;
	private int lifePoint;
	
	// attributes for methods
	private int attackScore;
	private int damage;
	
	public Perso(int strength, int lifePoint) {
		this.strength = strength;
		this.lifePoint = lifePoint;
	}
	
	public int attack() {
		this.attackScore = this.getStrength() + (int)(Math.random() * (1 - 10));
		return this.attackScore;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getLifePoint() {
		return lifePoint;
	}

	public void setLifePoint(int lifePoint) {
		this.lifePoint = lifePoint;
	}
	
}
