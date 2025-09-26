package data_structures.lists;

import java.util.Objects;

/**
 * Implements a stack using linked list.
 * @param <AnyType> type of the elements in this stack
 */
public class LinkedStack<AnyType> implements Stack<AnyType> {
	
	/**
	 * A class to represent the nodes in this stack.
	 * @param <AnyType> type of element in this node
	 */
	public class Node<AnyType> {
		
		/**
		 * Stores data of this node.
		 */
		private AnyType data;
		
		/**
		 * This link references the successor of this node.
		 */
		private Node<AnyType> next;
		
		/**
		 * Constructs a node for this stack.
		 * @param element the data of this node
		 */
		public Node(AnyType element) {
			data = element;
			next = null;
		}
	}
	
	/**
	 * A field to store the number of elements in this list.
	 */
	private int size;
	
	/**
	 * A field to store the top of stack.
	 */
	private Node<AnyType> topOfStack;
	
	/**
	 * Returns true if the stack is empty and false otherwise.
	 * @return true if the stack is empty and false otherwise
	 */
	public boolean isEmpty() {
		return topOfStack == null;
	}
	
	/**
	 * Returns the value of the element on top of stack without removing it.
	 * @return value of top of stack
	 */
	public AnyType peek() {
		if (isEmpty())
			throw new RuntimeException("Stack is empty.");
		return topOfStack.data;
	}
	
	/**
	 * Removes the element on top of stack and returns its value.
	 * @return value of top of stack
	 */
	public AnyType pop() {
		if (isEmpty())
			throw new RuntimeException("Stack is empty.");
		AnyType returnValue = topOfStack.data;
		topOfStack = topOfStack.next;
		size--;
		return returnValue;
	}
	
	/**
	 * Pushes the specified element onto the top of stack.
	 * @param element element to be pushed onto stack
	 * @return value of element to be pushed onto stack
	 */
	public AnyType push(AnyType element) {
		Node<AnyType> newNode = new Node<>(element);
		newNode.next = topOfStack;
		topOfStack = newNode;
		size++;
		return element;
	}
	
	/**
	 * Returns the 1-based position from top of the specified element in the stack.
	 * Returns -1 if the element is not in the stack.
	 * @param element element whose position is to be looked up
	 * @return 1-based position from top of the specified element in the stack
	 */
	public int search(AnyType element) {
		Node<AnyType> current = topOfStack;
		int position = 1;
		while (current != null) {
			if (Objects.equals(current.data, element))
				return position; // Match is found!
			current = current.next;
			position++;
		}
		return -1; // Match is not found.
	}
	
	/**
	 * Returns the number of elements in the stack.
	 * @return number of elements in the stack
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Returns a String representation of the stack.
	 * @return a String representation of the stack
	 */
	public String toString() {
		if (isEmpty()) return "[]";
		
		// Copy the whole stack into an array list
		ArrayList<AnyType> array = new ArrayList<>();
		Node<AnyType> current = topOfStack;
		while (current != null) {
			array.add(current.data);
			current = current.next;
		}
		
		// Traverse from bottom to top to build the string
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = array.size() - 1; i >= 0; i--) {
			builder.append(array.get(i));
			if (i > 0)
				builder.append(", ");
		}
		builder.append("]");
		return builder.toString();
	}
	
	public static void main(String[] args) {
		System.out.println("DEMO FOR A STACK, IMPLEMENTATION USING ARRAY");
		
		// Create an empty stack
		LinkedStack<Integer> s = new LinkedStack<>();
		
		// Push elements into stack
		System.out.println("Push: " + s.push(84));
		System.out.println("Push: " + s.push(15));
		System.out.println("Push: " + s.push(57));
		System.out.println("Push: " + s.push(39));
		System.out.println("Push: " + s.push(62));
		System.out.println(s.toString());
		
		// Look for index
		System.out.println("Index of 84: " + s.search(84));
		System.out.println("Index of 100: " + s.search(100));
		
		// Pop two elements
		System.out.println("Pop 1st time: " + s.pop());
		System.out.println("Pop 2nd time: " + s.pop());
		System.out.println(s.toString());
		
		// Peek
		System.out.println("Peek: " + s.peek());
	}
}
