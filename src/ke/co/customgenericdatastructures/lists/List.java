package ke.co.customgenericdatastructures.lists;


// class List definition
public class List<T> {
	private ListNode<T> firstNode;
	private ListNode<T> lastNode;
	private String name; // name of list

	public List() {
		this("list");
	}

	// constructor creates an empty list with a name
	public List(String listName) {
		name = listName;
		firstNode = lastNode = null;
	}

	// insert item at front of list
	public void insertAtFront(T insertItem) {
		if (isEmpty()) // firstNode and lastNode refer to same object
			firstNode = lastNode = new ListNode<T>(insertItem);
		else // firstNode refers to new node
			firstNode = new ListNode<T>(insertItem, firstNode);
	}

	// insert item at end of list
	public void insertAtBAck(T insertItem) {
		if (isEmpty()) // firstNode and lastNode refer to the same object
			firstNode = lastNode = new ListNode<T>(insertItem);
		else // lastNode's next node refers to new node
			lastNode = lastNode.nextNode = new ListNode<T>(insertItem);
	}// end method insertAtBack

	// remove first node from list
	public T removeFromFront() throws EmptyListException {
		if (isEmpty()) // throw exception if List is empty
			throw new EmptyListException(name);

		T removedItem = firstNode.data; // retrieve data being removed

		// update references firstNode and lastNode
		if (firstNode == lastNode)
			firstNode = lastNode = null;
		else { // locate new last node
			ListNode<T> current = firstNode;

			// loop while current node does not refer to lastNode
			while (current.nextNode != lastNode)
				current = current.nextNode;

		} // end else
		return removedItem;// return removed node data
	}// end method

	// determine whether list is empty
	public boolean isEmpty() {
		return firstNode == null;// return true if list is empty
	}

	// outputt list contents
	public void print() {
		if (isEmpty()) {
			System.out.printf("Empty %s\n", name);
			return;
		}

		System.out.printf("The %s is \n", name);
		ListNode<T> current = firstNode;

		// while not at end of list, output current node's data
		while (current != null) {
			System.out.printf("%s ", current.data);
			current = current.nextNode;
		} // end while

		System.out.println("\n");
	}
}