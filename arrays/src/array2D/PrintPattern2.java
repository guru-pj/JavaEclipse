package array2D;

import java.util.Scanner;

public class PrintPattern2 {
	public static void main(String[] args) {
//		input=5				input=2
//			*****					**
//			****					*
//			***
//			**
//			*

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input Number: ");
		int n = s.nextInt();

		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
