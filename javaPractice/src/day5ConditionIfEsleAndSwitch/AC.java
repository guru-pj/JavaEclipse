package day5ConditionIfEsleAndSwitch;

import java.util.Scanner;

public class AC {
	public static void main(String[] args) {

		int p = 30000;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The warranty details only with true ot false: ");
		boolean isWarranty = s.nextBoolean();

		if (isWarranty) {
			System.out.println(p + 10000);
		} else {
			System.out.println(p - 10000);
		}

	}

}
