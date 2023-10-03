package day1;

import java.util.Scanner;

public class InputfloatAdd {
	public static void main(String[] args) {
		Scanner S1 = new Scanner(System.in);
		float num1 = S1.nextFloat();

		Scanner S2 = new Scanner(System.in);
		float num2 = S2.nextFloat();

		float total = num1 + num2;

		System.out.println("The Total value is : " + total);
	}

}
