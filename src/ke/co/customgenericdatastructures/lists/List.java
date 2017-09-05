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
			firstNode = firstNode.nextNode;

		} // end else
		return removedItem;// return removed node data
	}// end method

	// remove last node form list
	public T removeFromBack() throws EmptyListException {
		if (isEmpty()) // throw exception of list is empty
			throw new EmptyListException(name);

		T removedItem = lastNode.data;// retrieve data being removed

		// update references firstNode and lastNode
		if (firstNode == lastNode)
			firstNode = lastNode = null;
		else // locate new last node
		{
			ListNode<T> current = firstNode;

			// loop while current node does not refer to lastNode
			while (current.nextNode != lastNode)
				current = current.nextNode;

			lastNode = current;// current is new lastNode
			current.nextNode = null;
		}
		return removedItem;// return removed node data
	}

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

	public ListNode<T> find(int index) {
		int currentIndex = 0;

		if (isEmpty()) {
			return null;
		}
		ListNode<T> current = firstNode;
		// while not at end of list, output current node's data
		while (current != null) {
			if (currentIndex == index) {
				return current;
			}
			current = current.nextNode;
			currentIndex++;
		} // end while
		return firstNode;

	}

	// replace item at specific position in list
	public void replaceAt(T insertItem, int position) {
		ListNode<T> item = find(position);
		item.nextNode = new ListNode<T>(insertItem);
	}

	// get list size
	public int size() {
		int size = 0;
		if (isEmpty()) {
			return size;
		}
		ListNode<T> current = firstNode;
		// while not at end of list, output current node's data
		while (current != null) {
			current = current.nextNode;
			size++;
		} // end while
		return size;
	}

}