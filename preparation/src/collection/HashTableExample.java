package collection;

import java.util.*;

public class HashTableExample {
	public static void main(String[] args) {
		Hashtable<Integer, String> names = new Hashtable<>(10);
		names.put(1101, "Guru");
		names.put(1102, "Vishnu");
		names.put(1103, "dilip");
		names.put(1104, "sathya");
		names.put(1105, "ram");
		names.put(1106, "ram");
		names.put(1107, "Arun");
		names.put(1108, "Dharani");
		names.put(1109, "vinoth");
		names.put(1110, "kumar");
		names.put(1111, "ramya");
		names.put(1112, "sowmya");

		for (Integer i : names.keySet()) {
			// System.out.println(i + " " + names.get(i) + " " + i.hashCode() % 10);
			System.out.println(i);
		}

	}
}
