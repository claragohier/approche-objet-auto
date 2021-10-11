package fr.diginamic.entities;

/**
 * This class correspond to theater object
 * @author clarousse
 *
 */
public class Theater {
	
	private String name;
	private int max;
	private int registeredClients;
	private double recipe;
	
	public Theater(String name, int max, int registeredClients, double recipe) {
		this.name = name;
		this.max = max;
		this.registeredClients = registeredClients;
		this.recipe = recipe;
	}
	
	/**
	 * register method
	 * @param clients
	 * @param price
	 */
	public void register(int clients, int price) {
		if(this.registeredClients < this.max) {
			this.registeredClients += clients;
			this.recipe += price * clients;
		} else {
			System.err.println("Il n'y a plus de place");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getClients() {
		return registeredClients;
	}

	public void setClients(int registeredClients) {
		this.registeredClients = registeredClients;
	}

	public double getRecipe() {
		return recipe;
	}

	public void setRecipe(double recipe) {
		this.recipe = recipe;
	}
	
	

}
