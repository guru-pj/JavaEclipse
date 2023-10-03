package array2D;

import java.util.*;

public class PrintPattern1 {
	public static void main(String[] args) {
//		input=5				input=2
//			*					*
//			**					**
//			***
//			****
//			*****

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input Number: ");
		int n = s.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
