package ke.co.customgenericdatastructures.lists;

public class ListTest {
	public static void main(String[] args) {
		List<Integer> list = new List<Integer>();
		
		//insert integers in list
		list.insertAtFront(-1);
		list.insertAtFront(2);
		list.insertAtFront(5);
		list.print();
		
		ListNode<Integer> item=list.find(2);
		System.err.println("Found Item is : "+item.getData());
		
		System.err.println("Size of list is: "+list.size());
	}
}
