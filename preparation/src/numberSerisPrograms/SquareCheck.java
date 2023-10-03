package numberSerisPrograms;

import java.util.Scanner;

public class SquareCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input: ");
		double n = sc.nextDouble();
		double sqR = Math.sqrt(n);
		System.out.println(sqR);
		if (sqR * sqR == n) {
			System.out.println("it is a perfect square");
		} else {
			System.out.println("its not a perfect square");
		}
	}
}
