 package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
		// METHODS IN STREAM API
		// stream()->iterates
		// filter()->acts as a condition
		// map()->to get specific fields
		// collect()->collecting values using Collector class()having methods like
		// .toList(),.toMap(),.toSet()
		// count() -> counts the values after filtering

		ArrayList<String> names = new ArrayList<>();
		names.add("Guru");
		names.add("Dilip");
		names.add("Vishnu");
		names.add("Sathya");
		names.add("Vinoth");

		// names.stream().filter(x
		// ->x.startsWith("V")).forEach(x->System.out.println(x));
		List<String> newNames = names.stream().filter(x -> x.startsWith("V")).collect(Collectors.toList());
		Long l = names.stream().filter(x -> x.startsWith("V")).count();
		System.out.println(newNames);
		System.out.println(l);

	}
}
