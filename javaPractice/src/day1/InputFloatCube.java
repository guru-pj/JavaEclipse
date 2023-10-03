package day1;

import java.util.Scanner;

public class InputFloatCube {
	public static void main(String[] args) {
	
		Scanner S1 = new Scanner(System.in);
		float num1 = S1.nextFloat();

		float total = (num1*num1)*num1;

		System.out.println("The Total value is : " + total);
	}

}
