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
	 * Returns true if the list is empty.
	 * @return true if the list is empty
	 */
	public boolean isEmpty();
	public int indexOf(AnyType element);
	public boolean remove(AnyType element);
	public AnyType remove(int index);
	public int size();
}
