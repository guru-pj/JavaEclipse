package programs;

import java.util.Arrays;

public class StringDuplicatesRealOne {
	public static void main(String[] args) {
		String a = "onesoftstechnologies";

//												1)-> no inbuilt methods

//		System.out.println("                        Using only loop");
//		System.out.println("input: " + a);
		//
//		for (int i = 0; i < a.length(); i++) {
//			int c = 0;
//			for (int j = i + 1; j < a.length(); j++) {
//				if (a.charAt(i) == a.charAt(j)) {
//					c++;
//				}
//			}
//			// prints only non duplicates
//			if (c == 0) {
//				// System.out.println(a.charAt(i) + " " + c);
//			}
//			// prints duplicates
//			if (a.charAt(i) == a.charAt(i)) {
//				// System.out.println(a.charAt() + " " + c);
//			}
//
//		}

//												2)->using charArray

		System.out.println("                        Using CharArray");

		char[] c = a.toCharArray();
		System.out.print("input: ");
		System.out.println(c);
//printing duplicates
		for (int i = 0; i < c.length; i++) {
			int count = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j] && c[j] != ' ') {
					count++;
					c[j] = 0;
				}
			}
			// printing duplicates with count
			if (count > 1 && c[i] != 0) {
				System.out.println(c[i] + " " + count);
			}
		}

	}
}
