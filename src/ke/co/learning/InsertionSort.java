package ke.co.learning;

/*
 * A simple but inefficient, sorting algorithm.
 * The first iteration of this algorithm takes the second element in the array
 * and if it's less than the first element, swaps it with the first element
 * . The second iteration looks at the third element and inserts it into
 *  the correct position with respect to the first two, so all three elements are in order
 *  At the ith iteration of this algorith, the first i elements in the original array will be sorted
 *  */
import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

	private int[] data;// array of values
	private static final Random generator = new Random();

	// create array of given size and fill with random integers
	public InsertionSort(int size) {
		data = new int[size];

		// fill array with random ints in range 10-99
		for (int i = 0; i < size; i++) {
			data[i] = 10 + generator.nextInt(90);
		}
	}

	// sort array using insertion sort
	public void sort() {
		int insert; // temporary variable to hold element to insert

		// loop of data.length -1 elements
		for (int next = 1; next < data.length; next++) {
			// sort value in current element
			insert = data[next];

			// initialize location to place element
			int moveItem = next;

			// search for place to put current element
			while (moveItem > 0 && data[moveItem - 1] > insert) {
				// shift element right one slot
				data[moveItem] = data[moveItem - 1];
				moveItem--;

			} // end while
			data[moveItem] = insert; // place inserted element
			printPass(next, moveItem);// output pass of algorithm
		}
	} // end method sort

	// print a pass of the algorithm
	public void printPass(int pass, int index) {
		System.out.print(String.format("after pass %2d: ", pass));

		// output elements till swapped item
		for (int i = 0; i < index; i++)
			System.out.print(data[i] + " ");

		System.out.print(data[index] + "* "); // indicate swap

		// finish outputting array
		for (int i = index + 1; i < data.length; i++)
			System.out.print(data[i] + " ");

		System.out.print("\n          "); // for alignment

		// indicate amount of array that is sorted
		for (int i = 0; i <= pass; i++)
			System.out.print("-- ");
		System.out.println("\n");
	} // end method printPass

	// method to output values in array
	public String toString() {
		return Arrays.toString(data);
	}

}
