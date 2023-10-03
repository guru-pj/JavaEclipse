package optionalClass;

import java.util.Optional;

public class NullPointerException {
	public static void main(String[] args) {
		String a = null;

		Optional<String> b = Optional.ofNullable(a);

		if (b.isPresent()) {
			System.out.println(a.toUpperCase());
		} else {
			System.out.println("Value is null");
		}

		// or another method using orElse() and orElseThrow()

		System.out.println(b.orElse("NullValue"));
		// System.out.println(b.orElseThrow(() -> new NullPointerException("Hi")));
	//	System.out.println(b.orElseThrow(new NullPointerException));

	}
}
