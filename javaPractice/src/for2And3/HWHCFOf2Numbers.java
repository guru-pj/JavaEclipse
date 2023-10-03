package for2And3;

import java.util.Scanner;

public class HWHCFOf2Numbers {
	public static void main(String args[]) {
		int a, b, hcf = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :: ");
		a = sc.nextInt();
		System.out.println("Enter second number :: ");
		b = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if (a % i == 0 && b % i == 0) {
					hcf = i; 
				}
			}
		}

		System.out.println("HCF of given two numbers is ::" + hcf);
	}
}
