package numberSerisPrograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for which factrial is needed: ");
		int num = s.nextInt();
		int j = 1;
		for (int i = num; i >= 1; i--) {
			j = j * i;
		}
		System.out.println("Ans:" + j);
	}
}
