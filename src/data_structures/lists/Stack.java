package data_structures.lists;

public interface Stack<AnyType> {
	public boolean isEmpty();
	public AnyType peek();
	public AnyType pop();
	public AnyType push();
	public int search(AnyType element);
	public int size();
}
