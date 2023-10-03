package patternsprints;

//55555
//4444
//333
//22
//1
import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value in int: ");
		int n = s.nextInt();

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				if (j <= i)
					System.out.print("*");
			}
			System.out.println();
		}

//		int i = n;
//		while (i >= 1) {
//			int j = 1;
//			while (j <= n) {
//				if (j <= i) {
//					System.out.print(i);
//				}
//				j++;
//			}
//			i--;
//			System.out.println();
//		}
	}
}
