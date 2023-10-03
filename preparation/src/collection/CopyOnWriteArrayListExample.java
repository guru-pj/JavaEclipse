package collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
	public static void main(String[] args) {
		List<String> a = new CopyOnWriteArrayList<>();
		a.add("Guru");
		a.add("Dilip");
		a.add("Vishnu");

		for (String x : a) {
			System.out.println(x);
		}
		System.out.println("");
		for (String x : a) {
			System.out.println(x);
			a.remove(0);
		}

		System.out.println(a.get(0));

	}
}
