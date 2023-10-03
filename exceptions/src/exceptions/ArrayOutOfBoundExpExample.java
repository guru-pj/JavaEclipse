package exceptions;

public class ArrayOutOfBoundExpExample {
	public static void main(String[] args) {
		int[] iA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 19 };
		System.out.println(iA[15]);
	}
}
