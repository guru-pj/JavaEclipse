package day1;

import java.util.Scanner;

public class InputIntAdd {
	public static void main(String[] args) {
		Scanner S1 = new Scanner(System.in);
		int num1 = S1.nextInt();

		Scanner S2 = new Scanner(System.in);
		int num2 = S2.nextInt();

		int total = num1 + num2;

		System.out.println("The Total value is : " + total);
	}

}
