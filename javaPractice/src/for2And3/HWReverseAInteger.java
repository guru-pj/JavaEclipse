package for2And3;

import java.util.Scanner;

public class HWReverseAInteger {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE INTEGER TO BE REVERSED: ");
		int n = s.nextInt();
		int d = 0, t = 0;
		for (; n != 0;) {
			d = n % 10;
			t = (t * 10) + d;
			n = n / 10;
		}
		System.out.println(t);
	}
}
