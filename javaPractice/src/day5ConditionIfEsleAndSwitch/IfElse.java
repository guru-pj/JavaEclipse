package day5ConditionIfEsleAndSwitch;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Coin Side: ");
		String toss = s.next();

		if (toss.equalsIgnoreCase("head")) {
			System.out.println("You Win");

		} else {
			System.out.println("You lose");
		}
		
		
	}

}
