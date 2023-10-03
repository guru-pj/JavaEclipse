package exceptions;

public class ExampleWithArgs {
	public static void main(String[] args) {
		String s = args[0];
		try {
			int num = Integer.parseInt(s);
			System.out.println(num);
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		} catch (NullPointerException npe) {
			System.out.println(npe);
		} catch (NumberFormatException nfe) {
			System.out.println("NumberFormatException Handled");
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println(s);

	}
}
