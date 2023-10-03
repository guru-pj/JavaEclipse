package day5ConditionIfEsleAndSwitch;

import java.util.Scanner;

public class IfElseAge {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int i = s.nextInt();

		if (i >= 18) {
			System.out.println("You are eligible to vote ");
		} 
		else {
			System.out.println("You are not eligible to Vote ");
		}
	}

}
