package for2And3;

public class SecondHalfSumOfIntArray {
	public static void main(String[] args) {
		int sum = 0;
		int[] iA = { 1, 2, 3, 4, 4, 3, 2, 1 };

		for (int i = iA.length / 2; i < iA.length; i++) {
			sum = sum + iA[i];
		}
		System.out.println(sum);
	}

}
