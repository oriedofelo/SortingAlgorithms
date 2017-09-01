package ke.co.learning.searching;

import java.util.Random;
import java.util.Arrays;

public class LinearArray {

	private int[] data;// array of values
	private static final Random generator = new Random();

	// create array of given size and fill with random numbers

	public LinearArray(int size) {
		data = new int[size];// create space for array

		// fill array with random int in range 10-99
		for (int i = 0; i < size; i++)
			data[i] = 10 + generator.nextInt(90);
	}

	// perform a linear search on the data
	public int linearSearch(int searchKey) {

		// loop through array sequentially
		for (int index = 0; index < data.length; index++) {
			if (data[index] == searchKey)
				return index; // return index of integer
		}
		return -1; // integer was not found
	} // end method linear search

	// method to output value in array
	public String toString() {
		return Arrays.toString(data);
	}

}
