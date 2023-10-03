package exceptions;

public class NullPointerExpExample {
	public static void main(String[] args) {
		String a = null;

		try {
			System.out.println(a.length());
		}
//		catch (NullPointerException npe) {
//			System.out.println("Null Pointer Exception handled");
//		}
		catch (StringIndexOutOfBoundsException siobe) {
			System.out.println("String index out of Bound Exception Handled");
		}
//		catch (Exception e) {
//			System.out.println(e);
//		} 
		finally {
			System.out.println("Print After Exception Handled in finally block");
		}
	}

}
