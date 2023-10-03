package day1;

import java.util.Scanner;

public class InputAddTaxPercent5 {
	public static void main(String[] args) {
		System.out.println("Enter the value : ");
		Scanner S1 = new Scanner(System.in);
		int value = S1.nextInt();

		System.out.println("Enter the tax percent : ");
		Scanner s2 = new Scanner(System.in);
		int percent = s2.nextInt();
		int taxA = (value * percent) / 100;// taxAmount

		System.out.println(percent + " PercentTaxAmount of value is : " + taxA);

		int total = value + taxA;
		System.out.println("Total value is : " + total);

	}

}
