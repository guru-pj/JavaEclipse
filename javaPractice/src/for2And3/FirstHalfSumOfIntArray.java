package for2And3;

public class FirstHalfSumOfIntArray {
	public static void main(String[] args) {
		int sum = 0;
		int[] iA = { 1, 2, 3, 4, 4, 3, 2, 1 };

		for (int i = 0; i < iA.length / 2; i++) {
			sum = sum + iA[i];
		}
		System.out.println(sum);
	}
}

