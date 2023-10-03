package exceptions;

public class ExampleWithStringFinally {
	public static void main(String[] args) {
		String s = args[0];
		try {
			System.out.println(s.charAt(30));
		} catch (StringIndexOutOfBoundsException sibe) {
			System.out.println(sibe);
		} catch (NumberFormatException nfe) {
			System.out.println(nfe);
		} catch (ArrayIndexOutOfBoundsException aibe) {
			System.out.println(aibe);
		} catch (Exception e) {
			System.out.println(e);
		} finally { //
			System.out.println("Exception Handled");
			int a = 1;
			System.out.println(a);
		}
	}
}
