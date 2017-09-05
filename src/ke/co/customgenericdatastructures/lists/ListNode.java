package ke.co.customgenericdatastructures.lists;

//class to represent one node in a list
public class ListNode<T> {

	// package access members; List can access these directly
	T data; // data for this node
	ListNode<T> nextNode; // reference to the next node in the list
	int position;//stores position of item in list
	
	
	// constructor creates a ListNode that refers to object
	public ListNode(T object) {
		// TODO Auto-generated constructor stub
		this(object, null);
	}

	// constructor creates ListNode that refers to the specified
	// object and to the next ListNode
	public ListNode(T object, ListNode<T> node) {
		// TODO Auto-generated constructor stub
		data = object;
		nextNode = node;
	}

	// reference to data in node
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	// reference to next node in list
	public ListNode<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(ListNode<T> nextNode) {
		this.nextNode = nextNode;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}


}
