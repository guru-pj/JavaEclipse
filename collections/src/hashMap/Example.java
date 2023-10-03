package hashMap;

import java.util.HashMap;

public class Example {
	public static void main(String[] args) {

		HashMap<Integer, String> details = new HashMap<>();
		details.put(100, "Guru");
		details.put(101, "Godwin");
		details.put(102, "Dilip");
		details.put(110, "Vinoth");

		System.out.println(details);// 1st print both keys and values in array

		System.out.println(details.keySet());// only keys

		System.out.println(details.values());// only values

		System.out.println(details.get(110));// getting exact value of an key

		details.remove(110); // removing specific values using its key

		System.out.println(details);
		System.out.println("Prints using ENHANCED for and forEach method");// normal for is not iterable for hashmap

		// for (Integer i : details.keySet()) {
		// System.out.println(details.get(i);
		// }
		// for (String j : details.values()) {
		// System.out.println(j);
		// }

		// details.keySet().forEach(i -> System.out.println(details.get(i)));
		// details.values().forEach(i -> System.out.println(i));
		// Add odd values to another hashmap
		HashMap<Integer, String> odd = new HashMap<>();
		details.keySet().forEach(i -> {
			if (i % 2 != 0) {
				odd.put(i, details.get(i));
			}
		});
		System.out.println(odd);

	}
}
