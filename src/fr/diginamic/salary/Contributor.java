package fr.diginamic.salary;

public abstract class Contributor {
	
	private String lastname;
	private String firstname;
	
	public Contributor(String lastname, String firstname) {
		this.lastname = lastname;
		this.firstname = firstname;
	}
	
	public abstract double getSalary();
	public abstract String getStatus();

	public String displayInfos() {
		String infos = this.getLastname() +" "+ this.getFirstname() +" "+  this.getSalary() +" "+  this.getStatus();
		return infos;
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
	
}
