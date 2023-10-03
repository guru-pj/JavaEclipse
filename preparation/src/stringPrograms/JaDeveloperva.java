package stringPrograms;

import java.util.Scanner;

public class JaDeveloperva {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String s1 = sc.next();
		System.out.println("Enter the second String: ");
		String s2 = sc.next();

		String n = s1.substring(0, s1.length() / 2) + s2 + s1.substring(s1.length() / 2, s1.length());
		System.out.println(n);
	}
}
