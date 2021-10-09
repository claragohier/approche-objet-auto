package fr.diginamic.operations;

/**
 * This class allows you to do operations
 * @author clarousse
 *
 */
public class Operations {

	public static double calcul(double a, double b, char op) {
		
		switch (op) {
			case '+':
				return a + b;
			case '-':
				return a - b;
			case '/':
				return a / b;
			case '*':
				return a * b;
			default: 
				return 0;
		}
		
	}
}
