package day5ConditionIfEsleAndSwitch;

import java.util.Scanner;

public class OddEvenNumber {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");

		int i = s.nextInt();

		if (i % 2 == 0) {
			System.out.println("Even Number");
		} else {

			System.out.println("Odd Number");
		}
	}

}
