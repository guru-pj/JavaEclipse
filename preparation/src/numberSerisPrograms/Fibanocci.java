package numberSerisPrograms;

import java.util.Scanner;

public class Fibanocci {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number counts of fibanocci is needed:");
		int num = s.nextInt();
		int a = 0, b = 1, c = 0;
		System.out.print("0,1");
		long sum = 1;
		for (int i = 2; i < num; i++) {
			c = a + b;
			sum = sum + c;
			System.out.print("," + c);
			a = b;
			b = c;
		}
		System.out.println();
		System.out.println(sum);
	}
}
