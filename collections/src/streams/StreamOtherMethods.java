package streams;

import java.util.*;
import java.util.Comparator; //for min() and max()
import java.util.stream.Collectors;

public class StreamOtherMethods {

	public static void main(String[] args) {
		// l-lastly used
		// i-intermediate
		// sorted() ->i
		// distinct() ->i
		// summing() ->i
		// max() ->i
		// min() ->i
		// reversed() ->i
		// peek() ->i
		// skip() ->i
		// findFirst() ->l
		// findAny() ->l

		// Creating a list of strings
		List<String> list = Arrays.asList("Geeks", "for", "GeeksQuiz", "GeeksforGeeks", "GFG", "for", "Geeks", "ashwin",
				"Ashwin");
		List<Integer> nums = Arrays.asList(1, 4, 5, 7, 8, -19, 0, 4, -12, 3, 34, 56, 7, 323);
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);

		// sorted()
		// displaying the stream with elements
		// sorted in their natural order
		System.out.println("                         The sorted() stream is : ");
		list.stream().sorted().forEach(x -> System.out.println(x));
		System.out.println("                         The sorted() stream is : ");
		nums.stream().sorted().forEach(x -> System.out.println(x));

		// distinct()
		// gets only distinct values
		System.out.println("                         distinct() Method ");
		list.stream().distinct().forEach(x -> System.out.println(x));

		// reverse()
		// list.stream().collect(reverse)

		// min()
		System.out.println("                         The min() INTprint is : ");
		int min = nums.stream().min(Integer::compare).get();
		System.out.println(min);

		// max()
		System.out.println("                         The max() INTprint is : ");
		int max = nums.stream().max(Integer::compare).get();
		System.out.println(max);

		int sum = num.stream().collect(Collectors.summingInt(null));

		System.out.println(sum);
// 		max() min() in stream
//		System.out.println("                          The min() and max() print is : ");
//		Bike min = bikes.stream().max(Comparator.comparingInt(x -> x.getPrice())).get();
//		System.out.println(min);

	}

}
