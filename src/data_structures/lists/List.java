package data_structures.lists;

/**
 * A generic list interface that provides basic operations
 * for managing any type of list.
 * @param <AnyType> the type of elements stored in this list
 */
public interface List<AnyType> {
	
	/**
	 * Appends the specified element to the end of this list.
	 * @param element element to be appended to this list
	 * @return true
	 */
	public boolean add(AnyType element);
	
	/**
	 * Inserts the specified element at the specified position in this list.
	 * Shifts all elements to the right of the list.
	 * @param index index at which the specified element is to be inserted
	 * @param element element to be inserted
	 */
	public void add(int index, AnyType element);
	
	/**
	 * Removes all elements from this list.
	 * The list will be empty after this call returns.
	 */
	public void clear();
	
	/**
	 * Returns true if the list contains the specified element.
	 * @param element element whose presence in this list is to be tested
	 * @return true if the list contains the specified element
	 */
	public boolean contains(AnyType element);
	
	/**
	 * Returns the value of the element at the specified position.
	 * @param index index whose element value to be returned
	 * @return the value of the element at the specified position
	 */
	public AnyType get(int index);
	
	/**
	 * Returns true if the list is empty.
	 * @return true if the list is empty
	 */
	public boolean isEmpty();
	
	/**
	 * Returns the index of the first occurrence of the specified element in the list.
	 * Returns -1 if the element is not in the list.
	 * @param element element whose first occurrence in this list is to be looked up
	 * @return the index of the first occurrence of this element in the list
	 */
	public int indexOf(AnyType element);
	
	/**
	 * Replaces the element at the specified position in this list with the specified element.
	 * @param index index of the element to replace
	 * @param element element to be stored at the specified position
	 */
	public void set(int index, AnyType element);
	
	/**
	 * Removes the first occurrence of the specified element from this list, if it is present.
	 * @param element element to be removed from this list, if present
	 * @return true if this list contained the specified element
	 */
	public boolean remove(AnyType element);
	
	/**
	 * Removes the element at the specified position from the list.
	 * Shifts any subsequent elements to the left of this list.
	 * Returns the value of the element that was just deleted.
	 * @param index index of the element to be removed
	 * @return the element previously at the specified position
	 */
	public AnyType remove(int index);
	
	/**
	 * Returns the number of elements in this list.
	 * @return the number of elements in this list
	 */
	public int size();
	
	/**
	 * Returns a String representation of the list.
	 * @return a String representation of the list
	 */
	@Override
	public String toString();
}
