package learnings;

import java.util.*;

public class Streams {
	public static void main(String[] args) {
		// Driver code

		// Creating a list of strings
		List<String> list = Arrays.asList("Geeks", "for", "GeeksQuiz", "GeeksforGeeks", "GFG");

		System.out.println("The sorted stream is : ");

		// displaying the stream with elements
		// sorted in their natural order
		list.stream().sorted().forEach(System.out::println);
	}

}
