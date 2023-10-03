package numberSerisPrograms;

import java.util.Scanner;

public class ArmStrongNumberCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check for ArmStrong");
		int num = sc.nextInt();
		int res = 0, n = num, t = 0;
		String l = String.valueOf(num);
		while (n > 0) {
			t = n % 10;
			for (int i = 0; i < l.length(); i++) {
				t = t * t;
			}
			res = res + t;
			n = n / 10;
		}
		if (res == num) {
			System.out.println(num + " is an ArmStronng Number" + res);
		} else {
			System.out.println(num + " is not an ArmStrongNumber" + res);
		}
	}
}
