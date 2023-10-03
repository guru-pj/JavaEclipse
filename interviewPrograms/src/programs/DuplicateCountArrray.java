package programs;

import java.util.Arrays;

public class DuplicateCountArrray {
	public static void main(String[] args) {
		int[] iA = { 1, 2, 4, 5, 2, 4, 6, 7, 6, 6, 7, 6 };
		for (int i = 0; i < iA.length - 1; i++) {
			int c = 1;
			for (int j = i + 1; j < iA.length; j++) {
				if ((iA[i] == iA[j])) {
					c++;
					iA[j] = 0;
				}
			}
			if (c > 1 && iA[i] != 0) {
				System.out.println(iA[i] + " " + c);
			}
		}
		System.out.println(Arrays.toString(iA));
	}
}
