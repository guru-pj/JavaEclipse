package Tasks;

import java.util.Scanner;

public class CricketScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Player Name:");
		String name = sc.next();
		int total = 0;
		int left = 0, b = 0;
		for (int i = 1;; i++) {
			System.out.println("Enter the runs scored in the ball:");
			int r = sc.nextInt();
			b++;
			if (r > 0 && left < 3) {
				total = total + r;
				System.out.println("Total:" + total + "(" + b + ")");
			} else {
				left++;
				System.out.println("Total:" + total + "(" + b + ")");
				System.out.println("Balls left unattended by the Batsman: " + left);
				System.out.println();
			}
			if (left == 3) {
				System.out.println("Total Score by the Batsman: " + name + " is " + total + "(" + b + ")");
				System.out.println("Player got out by 3 balls left unattended");
				break;
			}
		}

	}
}
