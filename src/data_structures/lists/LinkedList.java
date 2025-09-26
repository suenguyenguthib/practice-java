package data_structures.lists;

/**
 * A class to represent the LinkedList in Java.
 * @param <AnyType> type of element in this list
 */
public class LinkedList<AnyType> implements List<AnyType> {
	
	/**
	 * A private class to represent the node of this list.
	 * @param <AnyType> type of element in the node
	 */
	public class Node<AnyType> {
		
		/**
		 * Data stored in the node.
		 */
		private AnyType data;
		
		/**
		 * This link references to the successor of this node.
		 */
		private Node<AnyType> next;
		
		/**
		 * Constructs the node of the list.
		 * @param data data that this node stores
		 */
		public Node(AnyType data) {
			this.data = data;
			this.next = null;
		}
		
		/**
		 * A helper method to check if this node has a successor or not.
		 * @return true if node has a successor and false otherwise
		 */
		public boolean hasNext() {
			return this.next != null;
		}
	}
	
	/**
	 * A field to represent the size of the list.
	 */
	private int size;
	
	/**
	 * A field to represent the head node of the list.
	 */
	private Node<AnyType> head;
	
	/**
	 * Constructs the skeleton of an empty linked list.
	 */
	public LinkedList() {
		head = null;
		size = 0;
	}
	
	/**
	 * Appends the specified element to the end of this list.
	 * @param element element to be appended to this list
	 * @return true
	 */
	public boolean add(AnyType element) {
		Node<AnyType> newNode = new Node<>(element);
		
		// Sets head node to be this node if the list is empty
		if (isEmpty())
			head = newNode;
		
		// Traverses to the end of the list to add this node into it
		else {
			Node<AnyType> current = head;
			while (current.hasNext())
				current = current.next;
			current.next = newNode;
		}
		
		// Updates the size of the list
		size++;
		return true;
	}
	
	/**
	 * Inserts the specified element at the specified position in this list.
	 * Shifts all elements to the right of the list.
	 * @param index index at which the specified element is to be inserted
	 * @param element element to be inserted
	 */
	public void add(int index, AnyType element) {
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException();
		
		Node<AnyType> newNode = new Node<>(element);
		if (index == 0) { // Insert to the front of the list
			newNode.next = head;
			head = newNode;
			size++;
		}
		else { // Traverse to the node at index - 1
			Node<AnyType> current = head;
			for (int i = 0; i < index - 1; i++)
				current = current.next;
			newNode.next = current.next;
			current.next = newNode;
			size++;
		}
	}
	
	/**
	 * Removes all elements from this list.
	 * The list will be empty after this call returns.
	 */
	public void clear() {
		head = null;
		size = 0;
	}
	
	/**
	 * Returns true if the list contains the specified element.
	 * @param element element whose presence in this list is to be tested
	 * @return true if the list contains the specified element
	 */
	public boolean contains(AnyType element) {
		Node<AnyType> current = head;
		while (current != null) {
			if (current.data.equals(element))
				return true; // Match is found!
			current = current.next;
		}
		return false; // Match is not found.
	}
	
	/**
	 * Returns the value of the element at the specified position.
	 * @param index index whose element value to be returned
	 * @return the value of the element at the specified position
	 */
	public AnyType get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		Node<AnyType> current = head;
		for (int i = 0; i < index; i++) // Traverse to the node at the specified index
			current = current.next;
		return current.data;
	}
	
	/**
	 * Returns true if the list is empty.
	 * @return true if the list is empty
	 */
	public boolean isEmpty() {
		return head == null;
	}
	
	/**
	 * Returns the index of the first occurrence of the specified element in the list.
	 * Returns -1 if the element is not in the list.
	 * @param element element whose first occurrence in this list is to be looked up
	 * @return the index of the first occurrence of this element in the list
	 */
	public int indexOf(AnyType element) {
		Node<AnyType> current = head;
		int index = 0;
		while (current != null) {
			if (current.data.equals(element))
				return index; // Match is found!
			current = current.next;
			index++;
		}
		return -1; // Match is not found.
	}
	
	/**
	 * Replaces the element at the specified position in this list with the specified element.
	 * @param index index of the element to replace
	 * @param element element to be stored at the specified position
	 */
	public void set(int index, AnyType element) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		
		Node<AnyType> current = head;
		for (int i = 0; i < index; i++) // Traverse to the node at the specified index
			current = current.next;
		current.data = element;
	}
	
	/**
	 * Removes the first occurrence of the specified element from this list, if it is present.
	 * @param element element to be removed from this list, if present
	 * @return true if this list contained the specified element
	 */
	public boolean remove(AnyType element) {
		if (isEmpty())
			return false;
		
		if (head.data.equals(element)) {
			head = head.next;
			size--;
			return true;
		}
		else {
			Node<AnyType> current = head;
			while (current.hasNext()) {
				if (current.next.data.equals(element)) {
					current.next = current.next.next;
					size--;
					return true;
				}
				current = current.next;
			}
			return false;
		}
	}
	
	/**
	 * Removes the element at the specified position from the list.
	 * Shifts any subsequent elements to the left of this list.
	 * Returns the value of the element that was just deleted.
	 * @param index index of the element to be removed
	 * @return the element previously at the specified position
	 */
	public AnyType remove(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		
		if (index == 0) {
			AnyType removed = head.data;
			head = head.next;
			size--;
			return removed;
		}
		else {
			Node<AnyType> current = head;
			for (int i = 0; i < index - 1; i++) // Traverse to the specified position
				current = current.next;
			AnyType removed = current.next.data;
			current.next = current.next.next;
			size--;
			return removed;
		}
	}
	
	/**
	 * Returns the number of elements in this list.
	 * @return the number of elements in this list
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Returns a String representation of the list.
	 * @return a String representation of the list
	 */
	public String toString() {
		if (isEmpty())
			return "[]";
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		Node<AnyType> current = head;
		while (current != null) {
			builder.append(current.data);
			if (current.hasNext())
				builder.append(", ");
			current = current.next;
		}
		builder.append("]");
		return builder.toString();
	}
}
