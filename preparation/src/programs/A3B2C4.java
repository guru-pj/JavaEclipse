package programs;

import java.util.*;

public class A3B2C4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input:" + "\n" + "Sample: a3b2c4....");
		String s = sc.next();
		System.out.println("Input:" + s);

//		String[] s1 = s.split("[0-9]");
//		String[] s2 = s.split("[a-z]");
//
//		System.out.println(Arrays.toString(s1));
//		System.out.println(Arrays.toString(s2));
//		System.out.println(s2[1]);

		String t1 = "", t2 = "";
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 != 0) {
				t2 = t2 + s.charAt(i);
			} else {
				t1 = t1 + s.charAt(i);
			}

		}
		System.out.println("chars in the given string:" + t1);
		System.out.println("print counts for each chars:" + t2);

		String res = "";
		for (int i = 0; i < t1.length(); i++) {
			for (int j = 1; j <= Integer.parseInt(Character.toString(t2.charAt(i))); j++) {
				res = res + t1.charAt(i);
			}
		}
		System.out.println("OUTPUT: " + res);

	}
}
