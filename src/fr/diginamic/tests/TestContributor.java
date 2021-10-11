package fr.diginamic.tests;
import fr.diginamic.salary.*;

/**
 * This class allows to test Contributor class and methods
 * @author clarousse
 *
 */
public class TestContributor {

	public static void main(String[] args) {

		Employee employee = new Employee("Toto", "Titi", 2000.5);
		Freelance freelance = new Freelance("Tata", "Tutu", 15, 145.85);
		
		System.out.println(employee.getSalary());
		System.out.println(employee.displayInfos());

		System.out.println(freelance.getSalary());
		System.out.println(freelance.displayInfos());
		
	}

}
