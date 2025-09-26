package data_structures.lists;

/**
 * A generic stack interface.
 * @param <AnyType> type of elements stored in this stack
 */
public interface Stack<AnyType> {
	
	/**
	 * Returns true if the stack is empty and false otherwise.
	 * @return true if the stack is empty and false otherwise
	 */
	public boolean isEmpty();
	
	/**
	 * Returns the value of the element on top of stack without removing it.
	 * @return value of top of stack
	 */
	public AnyType peek();
	
	/**
	 * Removes the element on top of stack and returns its value.
	 * @return value of top of stack
	 */
	public AnyType pop();
	
	/**
	 * Pushes the specified element onto the top of stack.
	 * @param element element to be pushed onto stack
	 * @return value of element to be pushed onto stack
	 */
	public AnyType push(AnyType element);
	
	/**
	 * Returns the 1-based position from top of the specified element in the stack.
	 * Returns -1 if the element is not in the stack.
	 * @param element element whose position is to be looked up
	 * @return 1-based position from top of the specified element in the stack
	 */
	public int search(AnyType element);
	
	/**
	 * Returns the number of elements in the stack.
	 * @return number of elements in the stack
	 */
	public int size();
	
	/**
	 * Returns a String representation of the stack.
	 * @return a String representation of the stack
	 */
	public String toString();
}
