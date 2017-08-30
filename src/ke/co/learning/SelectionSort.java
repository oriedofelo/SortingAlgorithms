package ke.co.learning;

import java.util.Arrays;
import java.util.Random;

//this demostrates Selection Sort Algorithm
/*
Selection sort - simple, but inefficient, sorting algorithm.
First iteration selects the smallest element in the array and swaps it with the first element.
The second iteration selects the second-smallest item (which is the smallet item of the remaining elements)
and swaps it with the second element;
The algorithm continues until the last iteration selects the second-largest element and swaps it with the second-to-last
index, leaving the largest element in the last index.
Efficiency of selection sort is O(n^2) time
 */
public class SelectionSort {

	private int[] data; // array of values
	private static final Random generator = new Random();

	// create array of given size and fill with random integers
	public SelectionSort(int size) {
		data = new int[size];// create space for array

		// fill array with random ints in range 10-99
		for (int i = 0; i < size; i++)
			data[i] = 10 + generator.nextInt(90);
	}

	// sort array using selection sort
	public void sort() {
		int smallest; // index of smallest element

		// loop over data.length-1 elements
		for (int i = 0; i < data.length - 1; i++) {
			smallest = i; // first index of remaining array

			// loop to find index of smallest element
			for (int index = i + 1; index < data.length; index++)
				if (data[index] < data[smallest])
					smallest = index;

			swap(i, smallest); // swap smallest element into position
			printPass(i + 1, smallest);// output pass of algorithm
		} // end outer for
	}// end method sort

	// helper method to swap values in two elements
	public void swap(int first, int second) {
		int temporary = data[first]; // store first in temporary
		data[first] = data[second];
		data[second] = temporary; // put temporary in second
	}

	// print a pass of the algorithm
	public void printPass(int pass, int index) {
		System.out.print(String.format("after pass %2d: ", pass));

		// output elements till selected item
		for (int i = 0; i < index; i++)
			System.out.print(data[i] + " ");

		System.out.print(data[index] + "* "); // indicate swap

		// finish outputting array
		for (int i = index + 1; i < data.length; i++)
			System.out.print(data[i] + " ");

		System.out.println("\n                ");// for alignment

		// indicate amount of array that is sorted
		for (int j = 0; j < pass; j++)
			System.out.print("-- ");
		System.out.println("\n");
	}

	// method to output values in array
	public String toString() {
		return Arrays.toString(data);
	}

}
