package for2And3;

import java.util.Scanner;

public class HWReverseAIntegerUsingRecursion {

	public static void reverse(int n) {
		int t = 0, d = 0;

		for (; n != 0;) {
			t = n % 10;
			d = (d * 10) + t;
			n = n / 10;
		}
		System.out.println(d);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to be Reversed: ");
		int n = s.nextInt();

		reverse(n);

	}
}
