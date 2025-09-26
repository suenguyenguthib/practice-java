package data_structures.lists;

/**
 * A generic queue interface.
 * @param <AnyType> type of elements stored in this queue
 */
public interface Queue<AnyType> {
	
	/**
	 * Returns true if the queue is empty and false otherwise.
	 * @return true if the queue is empty and false otherwise
	 */
	public boolean isEmpty();
	
	/**
	 * Adds the element to the end of the queue.
	 * @param element element to be added to end of queue
	 * @return the value of the newly added element
	 */
	public AnyType enqueue(AnyType element);
	
	/**
	 * Retrieves and removes the element at the front of the queue.
	 * @return the value of the element at the front of the queue
	 */
	public AnyType dequeue();
	
	/**
	 * Returns the value of the element at the front of the queue.
	 * @return the value of the element at the front of the queue
	 */
	public AnyType poll();
	
	/**
	 * Returns the 1-based position from the front of this element.
	 * @param element element whose position is to be looked up
	 * @return the 1-based position from the front of this element
	 */
	public int search(AnyType element);
	
	/**
	 * Returns the number of elements in this queue.
	 * @return the number of elements in this queue
	 */
	public int size();
	
	/**
	 * Returns a String representation of this queue.
	 * @return a String representation of this queue
	 */
	@Override
	public String toString();
}
