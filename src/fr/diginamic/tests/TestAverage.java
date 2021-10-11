package fr.diginamic.tests;
import fr.diginamic.operations.Averaging;

/**
 * This class allows to test the Averaging class
 * @author clarousse
 *
 */
public class TestAverage {

	public static void main(String[] args) {

		Averaging array = new Averaging();
		array.add(8.98);
		array.add(10.2);
		array.add(98.3);
		
		double[] arrayContent = array.getArray();
		
		for(int i = 0; i < arrayContent.length; i++) {
			System.out.println("Index " + i + " : " + arrayContent[i]);
		}
		
		System.out.println("Average : " + array.calcul());
		
	}

}
