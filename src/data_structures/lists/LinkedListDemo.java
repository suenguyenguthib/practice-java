package data_structures.lists;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<>();
		System.out.println("DEMO THE USE OF LINKED LIST CLASS");
		System.out.println("\nSize: " + cities.size());
		System.out.println("Is empty: " + cities.isEmpty());
		System.out.println("Print list: " + cities.toString());
		
		System.out.println("\nTest 1: Add 5 new cities to the list.");
		cities.add("Philadelphia");
		cities.add("Cleveland");
		cities.add("Los Angeles");
		cities.add("Boston");
		cities.add("Oklahoma City");
		System.out.println("Size: " + cities.size());
		System.out.println("Is empty: " + cities.isEmpty());
		System.out.println("Print list: " + cities.toString());
		
		System.out.println("\nTest 2: Add 2 new cities at odd indices.");
		cities.add(1, "New York City");
		cities.add(3, "Richmond");
		System.out.println("Size: " + cities.size());
		System.out.println("Is empty: " + cities.isEmpty());
		System.out.println("Print list: " + cities.toString());
		
		System.out.println("\nTest 3: Add 5 more cities at even indicies.");
		cities.add(0, "Austin");
		cities.add(2, "Dallas");
		cities.add(4, "Salt Lake City");
		cities.add(6, "Columbus");
		cities.add(8, "Portland");
		System.out.println("Size: " + cities.size());
		System.out.println("Is empty: " + cities.isEmpty());
		System.out.println("Print list: " + cities.toString());
		
		System.out.println("\nTest 4: Remove 2 cities in the same state from the list.");
		cities.remove("Austin");
		cities.remove("Cleveland");
		System.out.println("Size: " + cities.size());
		System.out.println("Is empty: " + cities.isEmpty());
		System.out.println("Print list: " + cities.toString());
		
		System.out.println("\nTest 5: Set index 2 to Pittsburgh and index 4 to Atlanta");
		cities.set(2, "Pittsburgh");
		cities.set(4, "Atlanta");
		System.out.println("Size: " + cities.size());
		System.out.println("Is empty: " + cities.isEmpty());
		System.out.println("Print list: " + cities.toString());
		
		System.out.println("\nTest 6: Iterate through the list.");
		for (int i = 0; i < cities.size(); i++)
			System.out.println("Index: " + i + ". City: " + cities.get(i));

		System.out.println("\nTest 7: Clear the whole list. End of test.");
		cities.clear();
		System.out.println("Size: " + cities.size());
		System.out.println("Is empty: " + cities.isEmpty());
		System.out.println("Print list: " + cities.toString());
	}
}
