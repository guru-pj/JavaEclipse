package programs;

import java.util.ArrayList;
import java.util.Optional;

public class NullPointerExceptionHandling {
	public static void main(String[] args) {
		String[] a = { "hi", null, "hello", "guru", null };
		ArrayList<String> iAl = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			Optional<String> b = Optional.ofNullable(a[i]);
			if (b.isPresent()) {
				iAl.add(a[i]);
			} else {
				System.out.println("Null Value found at index : " + i);
			}
		}
		System.out.println(iAl);

	}
}
