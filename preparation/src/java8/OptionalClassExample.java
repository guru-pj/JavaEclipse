package java8;

import java.util.*;

public class OptionalClassExample {
	public static void main(String[] args) {
		String s = "null";
		// Optional<String> b = Optional.of(a);
		Optional<String> b = Optional.ofNullable(s);
		// Optional<String> b = Optional.empty();

		if (b.isPresent()) {
			System.out.println(s.toUpperCase()); // 1st print
		} else {
			System.out.println("Value is null"); // 1nd print
		}
//	 or another method using orElse() and orElseThrow()

		System.out.println(b.orElse("NullValue")); // 2nd print

//		System.out.println(b.orElseThrow(() -> new NullPointerException("Hi")));
//		System.out.println(b.orElse("NullValue"));
	}
}
