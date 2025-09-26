package data_structures.lists;

import java.util.Objects;

/**
 * Implements a stack using primitive array.
 * @param <AnyType> type of the elements in this stack
 */
public class ArrayStack<AnyType> {
	
	/**
	 * This stack class uses array as the underlying data structure to store its elements.
	 */
	private AnyType[] stack;
	
	/**
	 * A field to store the index value of the top of the stack.
	 * This can also act as a size indicator.
	 */
	private int topOfStack;
	private static final int DEFAULT_CAPACITY = 10;
	
	/**
	 * Constructor for an empty stack.
	 */
	@SuppressWarnings("unchecked")
	public ArrayStack() {
		stack = (AnyType[]) new Object[DEFAULT_CAPACITY];
		topOfStack = -1;
	}
	
	/**
	 * Constructs a stack with initialized capacity.
	 */
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		if (capacity < 0)
			throw new IllegalArgumentException("Capacity cannot be negative.");
		stack = (AnyType[]) new Object[Math.max(capacity, DEFAULT_CAPACITY)];
		topOfStack = -1;
	}
	
	/**
	 * Pushes the specified element to the top of the stack.
	 * @param element element to be pushed on top of stack
	 * @return the value of the element that was just pushed on top of stack
	 */
	public AnyType push(AnyType element) {
		if (topOfStack + 1 == stack.length)
			ensureCapacity();
		topOfStack++;
		stack[topOfStack] = element;
		return element;
	}
	
	/**
	 * Removes the object from the top of this stack and returns its value.
	 * This method throws an error if the stack is empty.
	 * @return the value previously at the top of the stack
	 */
	public AnyType pop() {
		if (isEmpty()) 
			throw new RuntimeException("Stack is empty.");
		AnyType returnValue = stack[topOfStack];
		stack[topOfStack] = null;
		topOfStack--;
		return returnValue;
	}
	
	/**
	 * Returns the value at the top of the stack without removing it from the stack.
	 * This method throws an error if the stack is empty.
	 * @return the value at the top of the stack
	 */
	public AnyType peek() {
		if (isEmpty()) 
			throw new RuntimeException("Stack is empty.");
		return stack[topOfStack];
	}
	
	/**
	 * Returns the number of elements in this stack.
	 * @return the number of elements in this stack
	 */
	public int size() {
		return topOfStack + 1;
	}
	
	/**
	 * Returns true if the stack is empty and false otherwise.
	 * @return true if the stack is empty and false otherwise
	 */
	public boolean isEmpty() {
		return topOfStack == -1;
	}
	
	/**
	 * Returns the 1-based position where an object is on this stack.
	 * @param element element whose presence is to be found
	 * @return the 1-based position where an object is on this stack
	 */
	public int search(AnyType element) {
		for (int i = topOfStack; i >= 0; i--) {
			if (Objects.equals(stack[i], element))
				return i + 1;
		}
		return -1;
	}
	
	/**
	 * Returns a String representation of this stack.
	 * @return a String representation of this stack
	 */
	public String toString() {
		if (isEmpty()) return "[]";
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = 0; i <= topOfStack; i++) {
			builder.append(stack[i]);
			if (i < topOfStack)
				builder.append(", ");
		}
		builder.append("]");
		return builder.toString();
	}
	
	// HELPER METHODS
	
	/**
	 * Creates a new stack with a size 1.5 as larger as the current size to make room for new elements.
	 */
	@SuppressWarnings("unchecked")
	private void ensureCapacity() {
		AnyType[] newStack = (AnyType[]) new Object[size() + size() / 2];
		for (int i = 0; i <= topOfStack; i++)
			newStack[i] = stack[i];
		stack = newStack;
	}
	
	public static void main(String[] args) {
		System.out.println("DEMO FOR A STACK, IMPLEMENTATION USING ARRAY");
		
		// Create an empty stack
		ArrayStack<Integer> s = new ArrayStack<>();
		
		// Push elements into stack
		s.push(84);
		s.push(15);
		s.push(57);
		s.push(39);
		s.push(62);
		System.out.println(s.toString());
		
		// Look for index
		System.out.println("Index of 84: " + s.search(84));
		System.out.println("Index of 100: " + s.search(100));
		
		// Pop two elements
		System.out.println("Pop 1st time: " + s.pop());
		System.out.println("Pop 2nd time: " + s.pop());
		System.out.println(s.toString());
	}
}
