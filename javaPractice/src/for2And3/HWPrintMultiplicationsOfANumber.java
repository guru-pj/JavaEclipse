package for2And3;

import java.util.Scanner;

public class HWPrintMultiplicationsOfANumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number For Which You need Tables: ");
		int n = s.nextInt();
		System.out.println("Enter the Number of times You need Tables: ");
		int n1 = s.nextInt();
		for (int i = 1; i <= n1; i++) {
			System.out.println(n + " * " + i + " = " + (i * n));
		}

	}
}
