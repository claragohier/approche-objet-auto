package fr.diginamic.salary;

public class Employee extends Contributor{
	
	private double salaryM;

	public Employee(String lastname, String firstname, double salaryM) {
		super(lastname, firstname);
		this.salaryM = salaryM;
	}

	public double getSalary() {
		return this.getSalaryM();
	}
	
	public String getStatus() {
		String status = "Employee";
		return status;
	}
	
	public double getSalaryM() {
		return salaryM;
	}

	public void setSalaryM(double salaryM) {
		this.salaryM = salaryM;
	}
	
}
