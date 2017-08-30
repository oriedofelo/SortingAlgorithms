package ke.co.learning;

public class SelectionSortTest {

	public static void main(String[] args){
		//create object to perform selection sort
		SelectionSort sortArray = new SelectionSort(10);
		 System.out.println("Unsorted Array:");
		 System.out.println(sortArray +"\n"); //print unsorted array
		 
		 sortArray.sort(); //sort array
		 
		 System.out.println("Sorted Array:");
		 System.out.println(sortArray); //print sorted array
	}
}
