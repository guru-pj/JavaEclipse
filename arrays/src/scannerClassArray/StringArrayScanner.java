package scannerClassArray;

import java.util.*;

public class StringArrayScanner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of strings you want to enter: ");
		int n = s.nextInt();
		String[] sA = new String[n];
		System.out.println("Now Enter the Strings:");
		for (int i = 0; i < n; i++) {
			sA[i] = s.next();
		}
		System.out.println("The Entered Strings are: ");
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				System.out.print(sA[i]);
			} else {
				System.out.print(sA[i] + ",");
			}
		}
	}
}
