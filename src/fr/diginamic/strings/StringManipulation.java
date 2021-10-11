package fr.diginamic.strings;
import fr.diginamic.entities.Salary;

/**
 * This class allows to manipulation of strings
 * @author clarousse
 *
 */
public class StringManipulation {

	public static void main(String[] args) {

		String string = "Durand;Marcel;2 523.5";
		
		char firstChar = string.charAt(0);
		System.out.println("First char : " + firstChar);
		
		int stringLength = string.length();
		System.out.println("String length : " + stringLength);
		
		int c = string.indexOf(';');
		System.out.println("Index of ';' char : " + c);
		
		int firstC = string.indexOf('D');
		int lastC = string.indexOf(';');
		String lastname = string.substring(firstC, lastC);
		System.out.println("Lastname : " + lastname);
		
		String lastnameUp = lastname.toUpperCase();
		System.out.println("Lastname to upper case : " + lastnameUp);
		
		String lastnameLow = lastname.toLowerCase();
		System.out.println("Lastname to lower case : " + lastnameLow);
		
		String[] array = string.split(";");
		System.out.println("Array of informations : ");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		int firstCF = string.indexOf('M');
		int lastCF = string.indexOf('l');
		String firstname = string.substring(firstCF, lastCF + 1);
		System.out.println("Firstname : " + firstname);
		
		int firstCS = string.indexOf('2');
		int first = string.indexOf("5");
		int lastCS = string.indexOf('5', first + 1);
		String salaryString = string.substring(firstCS, lastCS + 1);
		salaryString = salaryString.replace(" ", "");
		double salaryInt = Double.parseDouble(salaryString);
		System.out.println("Salary : " + salaryString);
		
		
		Salary salary = new Salary(lastname, firstname, salaryInt);
		System.out.println(salary.getLastname() + "\n" + salary.getFirstname() + "\n" + salary.getSalary());
		
	}

}
