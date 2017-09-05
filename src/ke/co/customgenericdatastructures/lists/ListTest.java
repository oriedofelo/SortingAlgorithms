package ke.co.customgenericdatastructures.lists;

public class ListTest {
	public static void main(String[] args) {
		List<Integer> list = new List<Integer>();
		
		//insert integers in list
		list.insertAtFront(-1);
		list.print();
		list.insertAtFront(0);
		list.print();
		list.insertAtBAck(5);
		list.print();
		list.removeFromFront();
		list.print();
		list.removeFromBack();
		list.print();
	}
}
