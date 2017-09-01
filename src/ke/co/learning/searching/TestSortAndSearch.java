package ke.co.learning.searching;

import ke.co.learning.MergeSort;

public class TestSortAndSearch {
	public static void main(String[] args) {
		int data[] = { 90, 40, 50, 10, 30, 20, 23 };
		MergeSort sort = new MergeSort(data);
		sort.sort();

		BinaryArray array = new BinaryArray(sort.getData());
		int location = array.binarySearch(50);
		System.err.println("Location is: " + location);

	}
}
