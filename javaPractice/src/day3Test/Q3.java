package day3Test;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		System.out.println("Enter Your String without Space: ");
		Scanner s1 = new Scanner(System.in);
		String s = s1.next();

		boolean b1 = s.contains("soft");
		boolean b2 = s.endsWith("v");

		System.out.println("Does your String have the word 'soft' :" + b1);
		System.out.println("Does your String ends with 'v' :" + b2);

	}

}
