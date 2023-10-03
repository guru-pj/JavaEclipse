package postCollection;

import java.util.*;

public class ArrayListPrimeOrNot {
	public static void main(String[] args) {
		ArrayList<Integer> s = new ArrayList<>();
		for (int i = 0; i < args.length; i++) {
			s.add(Integer.parseInt(args[i]));
		}
		for (int i = 0; i < s.size(); i++) {
			String temp = "PRIME";
			for (int j = 2; j < s.get(i); j++) {
				if (s.get(i) % j == 0) {
					temp = "NOT PRIME";
				}

				// System.out.print(s.get(i) + "-" + temp + ",");
			}
			System.out.println(s.get(i) + "-" + temp + ",");
		}
	}
}
