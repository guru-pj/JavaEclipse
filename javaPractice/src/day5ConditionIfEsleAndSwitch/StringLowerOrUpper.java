package day5ConditionIfEsleAndSwitch;

import java.util.Scanner;

public class StringLowerOrUpper {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Word: ");
		String s1 = s.next();
		String sU = s1.toUpperCase();
		String sL = s1.toLowerCase();
		if (s1.equals(sU)) {
			System.out.println("The word is in Upper Case");
		} else if (s1.equals(sL)) {
			System.out.println("The word is in Lower Case");
		} else {
			System.out.println("The Word is mixed with Upper and Lower Case");
		}
	}

}
