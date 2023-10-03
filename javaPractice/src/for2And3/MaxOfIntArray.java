package for2And3;

public class MaxOfIntArray {

	public static void main(String[] args) {

		int[] iA = { 1, 2, 3, 4, 4, 3, 2, 1 };
		int max = iA[0];
		for (int i = 0; i < iA.length; i++) {

			if (max < iA[i]) {
				max = iA[i];
			}

		}
		System.out.println(max);
	}

}
