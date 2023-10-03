package day5ConditionIfEsleAndSwitch;

import java.util.Scanner;

public class IfElseGreater {
	// get 2 numbers from console and print the greater number
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		int a = s.nextInt();

		System.out.println("Enter your second number: ");
		int b = s.nextInt();

		if (a > b) {
			System.out.println(a);

		} else {
			System.out.println(b);
		}

	}
}
