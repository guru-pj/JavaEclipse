package Tasks;

import java.util.Scanner;

public class PrimePRINT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input Upto Which yu need primeNumbers: ");
		int n = sc.nextInt();
		// String res = "a";
		for (int i = 3; i <= n; i++) {
			String res = "a";
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					res = "b";
				}
			}
			if (res == "a")
				System.out.print(i + " ");
		}
	}
}
