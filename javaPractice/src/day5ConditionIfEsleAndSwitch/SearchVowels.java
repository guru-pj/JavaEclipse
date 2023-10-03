package day5ConditionIfEsleAndSwitch;

import java.util.Scanner;

public class SearchVowels {
	public static void main(String[] args) {

		Scanner ss = new Scanner(System.in);
		System.out.println("Enter the word:");
		String s1 = ss.next();

		if (s1.contains("a") || s1.contains("e") || s1.contains("i") || s1.contains("o") || s1.contains("u")) {
			System.out.println("Vowel is present in the word ");

		} else {
			System.out.println("Vowel is not present in the word ");
		}
	}
}
