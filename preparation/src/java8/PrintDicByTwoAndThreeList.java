package java8;

import java.util.*;

public class PrintDicByTwoAndThreeList {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		ArrayList<Integer> n = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			n.add(a[i]);
		}

		PrintDivByTwoAndThree p = (x) -> {
			for (Integer i : x) {
				if (i % 2 == 0 && i % 3 == 0) {
					System.out.println(i);
				}
			}
		};
		p.print(n);
	}
}
