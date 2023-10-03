package basics;

import java.util.*;

public class UseMailException {
	public static void main(String[] args) throws MailException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your google mail_id: ");
		String mail_id = s.next();

		try {
			if (mail_id.endsWith("@gmail.com")) {
				System.out.println("ThankYou");
			}

			else {
				throw new MailException("given mail_id is invalid(doesnot belongs to google)");
			}
		} finally {
			System.out.println("Exception will throw if given mail id doesnot ends with @gmail.com");
		}
	}
}
