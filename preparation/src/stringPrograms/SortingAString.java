package stringPrograms;

import java.util.Scanner;

public class SortingAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.next();

		// int i = s.charAt(0);
		// System.out.println(i);
		int t = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 1; j < (s.length() - i); j++) {
				if ((int) s.charAt(j - 1) > (int) s.charAt(j)) {

					t = (int) s.charAt(j - 1);
					// s.charAt(j - 1) = (int) s.charAt(j);

				}
			}
		}

	}
}
