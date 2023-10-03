package Tasks;

import java.util.Arrays;

public class BubbleSorting {
	public static void main(String[] args) {
		int[] iA = { 2, 6, 3, 8, 2, 5, 9, 19, 10, 11 };
		int n = iA.length, t = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (iA[i] > iA[j]) {
					t = iA[i];
					iA[i] = iA[j];
					iA[j] = t;
				}
			}
		}
		System.out.println(Arrays.toString(iA));
	}
}
