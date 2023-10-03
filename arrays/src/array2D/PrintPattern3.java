package array2D;

import java.util.Scanner;

public class PrintPattern3 {
	public static void main(String[] args) {
//		input=5				input=2
//			1					1
//			12					12
//			123
//			1234
//			12345

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input Number: ");
		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
