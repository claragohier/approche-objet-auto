package fr.diginamic.salary;

public class Freelance extends Contributor {

	private double daysW;
	private double salaryJ;

	public Freelance(String lastname, String firstname, double daysW, double salaryJ) {
		super(lastname, firstname);
		this.daysW = daysW;
		this.salaryJ = salaryJ;
	}
	
	public double getSalary() {
		return daysW * salaryJ;
	}
	
	public String getStatus() {
		String status = "Freelance";
		return status;
	}

	public double getDaysW() {
		return daysW;
	}

	public void setDaysW(double daysW) {
		this.daysW = daysW;
	}

	public double getSalaryJ() {
		return salaryJ;
	}

	public void setSalaryJ(double salaryJ) {
		this.salaryJ = salaryJ;
	}
	
	
}
