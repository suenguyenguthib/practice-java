package hackerrank.arrays_ds;

/**
 * Link to problem: https://www.hackerrank.com/challenges/arrays-ds/problem
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ReverseArray {
	public static List<Integer> reverseArray(List<Integer> a) {
		List<Integer> newList = new ArrayList<>();
		for (int i = a.size() - 1; i >= 0; i--)
			newList.add(a.get(i));
		return newList;
	}
	
	public static void main(String[] args) {
		List<Integer> solution = new ArrayList<>(Arrays.asList(1, 4, 3, 2));
		System.out.println("Original array: " + solution.toString());
		System.out.println("After reverse: " + reverseArray(solution).toString());
	}
}
