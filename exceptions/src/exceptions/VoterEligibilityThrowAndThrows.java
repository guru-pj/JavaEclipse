package exceptions;

public class VoterEligibilityThrowAndThrows {
	public static void main(String[] args) throws AgeException {
		System.out.println("Welcome");
		int age = 17;
		if (age > 18) {
			System.out.println("Eligible to vote");
		} else {
			throw new AgeException("You are Under Age");
			// System.out.println("Not Eligible to vote");
		}
		// System.out.println("Hi");
		System.out.println("ThankYou");
	}
}
