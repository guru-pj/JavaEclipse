package testQuestions;

import java.util.*;

public class UseLogin {
	public static void main(String[] args) throws Login {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the UserID: " + "\n");
		String s1 = s.next();
		System.out.print("Enter the Password: " + "\n");
		String s2 = s.next();

		Login l1 = new Login(s1, s2);

		if (l1.getUserId().equals("guru_pj1173") && l1.getPassword().equals("9944726265Ajith")) {
			System.out.println("Welcome" + " " + l1.getUserId());
		} else {
			throw new Login("UserId and Password doesnot Match");
		}
	}
}
