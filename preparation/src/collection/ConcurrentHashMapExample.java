package collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
	public static void main(String[] args) {
		Map<Integer, String> a = new ConcurrentHashMap<>();
		a.put(1, "Guru");
		a.put(2, "Dilip");
		a.put(3, "Vishnu");

		for (String x : a.values()) {
			System.out.println(x);
			a.remove(1, "Guru");
		}
		for (String x : a.values()) {
			System.out.println(x);
		}

	}
}
