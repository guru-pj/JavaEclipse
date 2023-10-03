package numberSerisPrograms;

import java.util.Scanner;

public class PrimeNumbersPrint {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number upto which prime numbers to want: ");
		int n = s.nextInt();

		long begin = System.currentTimeMillis();

		for (int i = 2; i < n; i++) {
			int k = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					k = 1;
					break;
				}
			}
			if (k == 0) {
				System.out.print(i + ",");
			}
		}
		System.out.println();
		long end = System.currentTimeMillis();
		long time = end - begin;
		System.out.println("Elapsed Time: " + time + " milli seconds");

	}
}
