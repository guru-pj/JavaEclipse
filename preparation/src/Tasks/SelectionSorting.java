package Tasks;

import java.util.Arrays;

public class SelectionSorting {
	public static void main(String[] args) {
		int[] iA = { 2, 6, 3, 8, 2, 5, 9, 19, 10, 11 };
		int t = 0;
		for (int i = 0; i < iA.length - 1; i++) {
			int max = iA[i];
			for (int j = i + 1; j < iA.length; j++) {
				if (max > iA[j]) {
					max = iA[j];
					t = iA[i];
					iA[i] = max;
					iA[j] = t;
				}
			}
		}
		System.out.println(Arrays.toString(iA));
	}
}
