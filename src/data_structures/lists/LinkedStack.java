package data_structures.lists;

/**
 * Implements a stack using linked list.
 * @param <AnyType> type of the elements in this stack
 */
public class LinkedStack<AnyType> {
	
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
	
	
}
