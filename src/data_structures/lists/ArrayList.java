package data_structures.lists;

/**
 * A class to mimic the operations of Java's ArrayList.
 * @param <AnyType>
 */
public class ArrayList<AnyType> implements List<AnyType> {
	/**
	 * This ArrayList class uses the primitive Java array as an underlying data structure
	 * to store the elements of this list.
	 */
	private AnyType[] array;
	
	/**
	 * The number of elements in this list.
	 */
	private int size;
	
	/**
	 * The default capacity of the underlying array.
	 */
	private static final int DEFAULT_CAPACITY = 10;
	
	/**
	 * A constructor for the ArrayList class.
	 * Initializes the underlying array with a default capacity of 10.
	 */
	@SuppressWarnings("unchecked")
	public ArrayList() {
		array = (AnyType[]) new Object[DEFAULT_CAPACITY];
		size = 0;
	}
	
	/**
	 * A constructor for the ArrayList class with specified capacity.
	 */
	@SuppressWarnings("unchecked")
	public ArrayList(int capacity) {
		if (capacity < 0)
			throw new IllegalArgumentException("Capacity cannot be negative.");
		array = (AnyType[]) new Object[Math.max(capacity, DEFAULT_CAPACITY)];
		size = 0;
	}
	
	/**
	 * Appends the specified element to the end of this list.
	 * @param element element to be appended to this list
	 * @return true
	 */
	public boolean add(AnyType element) {
		// Increases the capacity of the array if needed.
		if (array.length == size)
			ensureCapacity();
		
		// Updates the size of the list as we add new element into it.
		array[size++] = element;
		return true;
	}
	
	/**
	 * Inserts the specified element at the specified position in this list.
	 * Shifts all elements to the right of the list.
	 * @param index index at which the specified element is to be inserted
	 * @param element element to be inserted
	 */
	public void add(int index, AnyType element) {
		if (index < 0 || index >= size)
			throw new ArrayIndexOutOfBoundsException();
		
		// Increases the capacity of the array if needed.
		if (array.length == size)
			ensureCapacity();
		
		// Shifts all elements to the right of the list
		for (int from = size - 1; from >= index; from--)
			array[from + 1] = array[from];
		
		// Updates the size of the list as we add element into it
		array[index] = element;
		size++;
	}
	
	/**
	 * Removes all elements from this list.
	 * The list will be empty after this call returns.
	 */
	public void clear() {
		for (int i = 0; i < array.length; i++)
			array[i] = null;
		size = 0;
	}
	
	/**
	 * Returns true if the list contains the specified element.
	 * @param element element whose presence in this list is to be tested
	 * @return true if the list contains the specified element
	 */
	public boolean contains(AnyType element) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element)
				return true; // Match is found!
		}
		return false; // Match is not found.
	}
	
	/**
	 * Returns the value of the element at the specified position.
	 * @param index index whose element value to be returned
	 * @return the value of the element at the specified position
	 */
	public AnyType get(int index) {
		if (index < 0 || index >= size)
			throw new ArrayIndexOutOfBoundsException();
		else
			return array[index];
	}
	
	/**
	 * Returns true if the list is empty.
	 * @return true if the list is empty
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * Returns the index of the first occurrence of the specified element in the list.
	 * Returns -1 if the element is not in the list.
	 * @param element element whose first occurrence in this list is to be looked up
	 * @return the index of the first occurrence of this element in the list
	 */
	public int indexOf(AnyType element) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element)
				return i; // Match is found!
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
			throw new ArrayIndexOutOfBoundsException();
		array[index] = element;
	}
	
	/**
	 * Removes the first occurrence of the specified element from this list, if it is present.
	 * @param element element to be removed from this list, if present
	 * @return true if this list contained the specified element
	 */
	public boolean remove(AnyType element) {
		int index = indexOf(element);
		if (index == -1) return false;
		else remove(index);
		return true;
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
			throw new ArrayIndexOutOfBoundsException();
		AnyType removed = array[index];
		
		// Shifts all elements to the left 
		for (int i = index; i < size - 1; i++)
			array[i] = array[i + 1];
		array[size] = null; // Sets the last element to null
		size--; // Updates size
		return removed;
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
		if (isEmpty()) return "[]"; // Returns an empty list if list is empty
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = 0; i < size; i++) {
			builder.append(array[i]);
			if (i != size - 1)
				builder.append(", "); // Adds comma between elements
		}
		builder.append("]");
		return builder.toString();
	}
	
	// HELPER METHODS FOR THIS CLASS
	
	/**
	 * Creates a new array with a size 1.5 larger than current size to make room for new elements.
	 */
	@SuppressWarnings("unchecked")
	private void ensureCapacity() {
		AnyType[] newArray = (AnyType[]) new Object[size + size / 2];
		for (int i = 0; i < array.length; i++)
			newArray[i] = array[i]; // copy all elements from the current array to the new array
		array = newArray;
	}
}
