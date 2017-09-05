package ke.co.learning.searching;

import java.util.Arrays;

import ke.co.learning.MergeSort;

public class RecursiveBinarySearch {
	 public int data[];

	    public RecursiveBinarySearch(int[] data) {
	        this.data = data;
	        MergeSort sort = new MergeSort(data);
	        sort.sort();
	    }

	    public static void main(String[] args) {
	        int testdata[] = {10, 40, 30, 50, 70, 5,41,23,24};
	        RecursiveBinarySearch app = new RecursiveBinarySearch(testdata);
	        int index = app.search(24, 0, testdata.length - 1);
	        System.err.println("Sorted Array is: "+Arrays.toString(testdata));
	        System.err.println("Item is located at " + index);
	    }

	    public int search(int searchElement, int low, int high) {
	        if ((high - low) >= 1) {
	            int middle = (low + high) / 2;
	            int middle2 = middle + 1;
	            if (searchElement == data[middle]) {
	                return middle;
	            } else if (searchElement < data[middle]) {
	                return search(searchElement, 0, middle);
	            } else {
	                return search(searchElement, middle2, high);
	            }

	        } else {
	            return -1;
	        }
	    }
	}
