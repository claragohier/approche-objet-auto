package fr.diginamic.entities;

/**
 * This class correspond to the salary object
 * @author clarousse
 *
 */
public class Salary {

	private String lastname;
	private String firstname;
	private double salary;
	
	public Salary(String lastname, String firstname, double salary) {
		this.lastname = lastname;
		this.firstname = firstname;
		this.salary = salary;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
