package data_structures.lists;

/**
 * Implements a queue using primitive array.
 * @param <AnyType type of the eleemnts in this queue
 */
public class ArrayQueue<AnyType> implements Queue<AnyType> {
    
    /**
     * This queue class uses array as the underlying data structure to store its elements.
     */
    private AnyType[] queue;
    
    /**
     * A field to store the index value of the front of the queue.
     */
    private int front;
    
    /**
     * A field to store the index value of the rear of the queue.
     */
    private int back;
    
    /**
     * A field to store the number of elements in this queue.
     */
    private int size;
    
    /**
     * The default capacity of this queue.
     */
    private static final int DEFAULT_CAPACITY = 10;
    
    /**
     * Constructor for an empty queue with a default capacity of 10.
     */
    @SuppressWarnings("unchecked")
    public ArrayQueue() {
        queue = (AnyType[]) new Object[DEFAULT_CAPACITY];
        front = 0;
        back = -1;
        size = 0;
    }
    
    /**
     * Constructs a queue with initialized capacity.
     * @capacity capacity defined by user
     */
    @SuppressWarnings("unchecked")
    public ArrayQueue(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("Capacity cannot be negative.");
        queue = (AnyType[]) new Object[Math.max(capacity, DEFAULT_CAPACITY)];
        front = 0;
        back = -1;
        size = 0;
    }

    /**
	 * Returns true if the queue is empty and false otherwise.
	 * @return true if the queue is empty and false otherwise
	 */
    @Override
	public boolean isEmpty() {
        return size == 0;
    }
	
	/**
	 * Adds the element to the end of the queue.
	 * @param element element to be added to end of queue
	 * @return the value of the newly added element
	 */
    @Override
	public AnyType enqueue(AnyType element) {
        if (size == queue.length)
            ensureCapacity();
        size++;
        back++;
        queue[back] = element;
        return element;
    }
	
	/**
	 * Retrieves and removes the element at the front of the queue.
	 * @return the value of the element at the front of the queue
	 */
    @Override
	public AnyType dequeue() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty.");
        AnyType returnValue = queue[front];
        queue[front] = null;
        front++;
        size--;
        return returnValue;
    }
	
	/**
	 * Returns the value of the element at the front of the queue.
	 * @return the value of the element at the front of the queue
	 */
    @Override
	public AnyType poll() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty.");
        return queue[front];
    }
	
	/**
	 * Returns the 1-based position from the front of this element.
	 * @param element element whose position is to be looked up
	 * @return the 1-based position from the front of this element
	 */
    @Override
	public int search(AnyType element) {
        for (int i = front; i <= back; i++) {
            if (queue[i] == element)
                return i - front + 1; // Match is found!
        }
        return -1; // Match is not found.
    }
	
	/**
	 * Returns the number of elements in this queue.
	 * @return the number of elements in this queue
	 */
    @Override
	public int size() {
        return size;
    }
	
	/**
	 * Returns a String representation of this queue.
	 * @return a String representation of this queue
	 */
	@Override
	public String toString() {
        if (isEmpty()) return "[]";
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = front; i <= back; i++) {
            builder.append(queue[i]);
            if (i < back)
                builder.append(", ");
        }
        builder.append("]");
        return builder.toString();
    }

    // HELPER METHODS

    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        AnyType[] newQueue = (AnyType[]) new Object[size() + size() / 2];
		for (int i = 0; i < size(); i++)
			newQueue[i] = queue[i];
		queue = newQueue;
    }

    public static void main(String[] args) {
        System.out.println("DEMO FOR A QUEUE, IMPLEMENTATION USING ARRAY");

        // Create an empty queue
        ArrayQueue<Integer> q = new ArrayQueue<>();

        // Enqueue elements
        System.out.println("Enqueue: " + q.enqueue(12));
        System.out.println("Enqueue: " + q.enqueue(14));
        System.out.println("Enqueue: " + q.enqueue(8));
        System.out.println("Enqueue: " + q.enqueue(9));
        System.out.println("Enqueue: " + q.enqueue(20));
        System.out.println("Enqueue: " + q.enqueue(16));
        System.out.println(q.toString());

        // Look for position
        System.out.println("Position of 12: " + q.search(12));
        System.out.println("Position of 16: " + q.search(16));
        System.out.println("Position of 9: " + q.search(9));

        // Dequeue two elements
        System.out.println("Dequeue 1st time: " + q.dequeue());
        System.out.println("Dequeue 2nd time: " + q.dequeue());
        System.out.println(q.toString());

        // Poll
        System.out.println("Poll: " + q.poll());
    }
}
