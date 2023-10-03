package day5ConditionIfEsleAndSwitch;

import java.util.Scanner;

public class LadderElseIfGradingMarks {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Your Mark: ");
		int i = s.nextInt();
		if (i <= 100) {
			if (i == 100) {
				System.out.println("You got a Perfect Score");
			} else if (i >= 90) {
				System.out.println("S Grade");
			} else if (i >= 80) {
				System.out.println("A Grade");
			} else if (i >= 70) {
				System.out.println("B Grade");
			} else if (i >= 60) {
				System.out.println("C Grade");
			} else if (i >= 50) {
				System.out.println("D Grade");
			} else if (i >= 0) {
				System.out.println("Fail");
			} else {
				System.out.println("Entered mark is incorrect");
			}
		} else {
			System.out.println("Entered Mark is incorrect");
		}
	}

}
