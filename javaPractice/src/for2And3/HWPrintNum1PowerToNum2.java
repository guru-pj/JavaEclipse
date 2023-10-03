package for2And3;

import java.util.Scanner;

public class HWPrintNum1PowerToNum2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number 1: ");
		int n1 = s.nextInt();
		System.out.println("Enter the Number 2: ");
		int n2 = s.nextInt();
		int t = 1;
		for (int i = 1; i <= n2; i++) {
			t = t * n1;
		}
		System.out.println(t);

	}
}
