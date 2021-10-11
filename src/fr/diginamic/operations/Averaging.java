package fr.diginamic.operations;
import java.util.Arrays;

/**
 * This class is used for calculate averages
 * @author clarousse
 *
 */
public class Averaging {
	
	private double[] array;

	public Averaging() {
		this.array = new double[0];
	}

	public double[] add(double nb) {
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = nb;

		return array;
	}

	public double calcul() {
		double sum = 0;

		for (int i = 0; i < this.array.length; i++) {
			sum += array[i];
		}

		sum = sum / array.length;
		return sum;
	}

	public double[] getArray() {
		return array;
	}

	public void setArray(double[] array) {
		this.array = array;
	}
	
}
