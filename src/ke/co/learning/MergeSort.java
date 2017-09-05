package ke.co.learning;

import java.util.Random;

/*
 * An efficient sorting algorithm but is conceptually more complex than
 * selection sort and insertion sort
 * The algorithm sorts an array by splitting an array into two equal
 * sized subarrays, sorting each subarray, then merging them into one larger array
 * With an odd number of elements, the algorithm creates the two subarrays such that
 * one has more elements than the other
 * The implementation of merge sort in this example is recursive,
 * the base case is an array with one element, which is, ofcourse sorted, so the merge
 * sort immediately returns in this case
 * */
public class MergeSort {

	private int[] data;// array of values
	private static final Random generator = new Random();

	public MergeSort(int[] data) {
		this.data = data;
	}
	

	// create array of given size and fill with random integers
	public MergeSort(int size) {
		data = new int[size];// create space for array

		// fill array with random ints in range 10-99
		for (int i = 0; i < size; i++)
			data[i] = 10 + generator.nextInt(90);

	}// end MergeSort Constructor

	// cals recursive split method to begin merge sorting
	public void sort() {
		//pass first and last elements of array
		sortArray(0, data.length - 1);
	}

	// splits array, sorts subarrays and merges subarrays into sorted array
	private void sortArray(int low, int high) {
		// test base case; size of array equals 1
		if ((high - low) >= 1) {
			int middle1 = (low + high) / 2; // calculate middle of array
			int middle2 = middle1 + 1; // calculate next element over

			System.out.println("split: " + subarray(low, high));
			System.out.println(" " + subarray(low, middle1));
			System.out.println(" " + subarray(low, middle1));
			System.out.println();

			// split array in half; sort each half (recursive calls)
			sortArray(low, middle1); // first half of array
			sortArray(middle2, high); // second half of array

			// merge two sorted arrays after split calls return
			merge(low, middle1, middle2, high);

		}

	}

	// merge two sorted subarrays into one sorted subarray
	private void merge(int left, int middle1, int middle2, int right) {
		int leftIndex = left; // index into left subarray
		int rightIndex = middle2; // index into right subarray
		int combinedIndex = left; // index into temporary working array
		int[] combined = new int[data.length];// working array

		// output two subarrays before merging
		System.out.println("merge: " + subarray(left, middle1));
		System.out.println(" " + subarray(middle2, right));

		// merge arrays until reaching end of either
		while (leftIndex <= middle1 && rightIndex <= right) {
			// place smaller of two current elements into result
			// and move to next space in arrays
			if (data[leftIndex] <= data[rightIndex])
				combined[combinedIndex++] = data[leftIndex++];
			else
				combined[combinedIndex++] = data[rightIndex++];
		} // end while

		// if left array is empty
		if (leftIndex == middle2)
			// copy in rest of right array
			while (rightIndex <= right)
			combined[combinedIndex++] = data[rightIndex++];
		else // right array is empty
				// copy in rest of left array
			while (leftIndex <= middle1)
				combined[combinedIndex++] = data[leftIndex++];

		// copy values back into original array
		for (int i = left; i <= right; i++)
			data[i] = combined[i];

		// output merged array
		System.out.println(" " + subarray(left, right));
		System.out.println();
	}// end method merge

	// method to output certain values in array
	public String subarray(int low, int high) {
		StringBuilder temporary = new StringBuilder();

		// output spaces for alignment
		for (int i = 0; i < low; i++)
			temporary.append(" ");

		// output elements left in array
		for (int i = low; i <= high; i++)
			temporary.append(" " + data[i]);

		return temporary.toString();

	}

	// method to output values in array
	public String toString() {
		return subarray(0, data.length - 1);
	}// end method toString



	public int[] getData() {
		return data;
	}



	public void setData(int[] data) {
		this.data = data;
	}

}// end class MergeSort
