package day5ConditionIfEsleAndSwitch;

import java.util.Scanner;

public class Largerbtw3Numbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the 1st Number: ");
		int a = s.nextInt();
		System.out.println("Enter the 2st Number: ");
		int b = s.nextInt();
		System.out.println("Enter the 3st Number: ");
		int c = s.nextInt();

		if (a > b && a > c) {
			System.out.println(a + " is Greater");
		} else if (b > a && b > c) {
			System.out.println(b + " is Greater");
		} else {
			System.out.println(c + " is Greater");
		}
	}

}
