package day5ConditionIfEsleAndSwitch;

import java.util.Scanner;

public class IfElse2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Number: ");
		int n = s.nextInt();

		String res;
		if (n > 0) {
			res = "Positive Number";

		} else if (n < 0) {
			res = "Negative Number";
		} else {
			res = "Neutral";

		}

		System.out.println("Enter your name : ");
		String s1 = s.next();
		System.out.println(s1 + " You entered a " + res);

	}
}
