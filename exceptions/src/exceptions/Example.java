package exceptions;

public class Example {
	public static void main(String[] args) {
		System.out.println("Welcome");
		int n1 = 10, n2 = 0;
		System.out.println(n1);
		System.out.println(n2);
		try {
			System.out.println(n1 / n2);
		} catch (Exception e) {

			System.out.println("Dont divide any number by zero");
			// System.out.println(e);
			// e.printStackTrace();

		}
		System.out.println("ThankYou");
	}

}
