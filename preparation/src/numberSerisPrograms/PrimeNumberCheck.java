package numberSerisPrograms;

import java.util.Scanner;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to check for Prime:");
		int n = s.nextInt();

		String b = "Prime Number";
		long begin = System.currentTimeMillis();
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				b = "not a Prime Number";
				break;
			}
		}
		System.out.println(n + " is a " + b);
		long end = System.currentTimeMillis();
		long time = end - begin;
		System.out.println("Elapsed Time: " + time + " milli seconds");
	}
}
