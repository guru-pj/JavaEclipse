package for2And3;

public class CountOfEvenNumbersOfIntArray {
	public static void main(String[] args) {
		int sum = 0, count = 0;
		int[] iA = { 1, 2, 3, 4, 4, 3, 2, 1 };

		for (int i = 0; i < iA.length; i++) {
			if (iA[i] % 2 == 0) {
				sum = sum + iA[i];
				count = count + 1;
			}
		}
		System.out.println(count);
	}
}
