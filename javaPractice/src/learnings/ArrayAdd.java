package learnings;

import java.util.*;

public class ArrayAdd {
	public static void main(String[] args) {
		String[] s = args[0].split(",");

		int[] iA = new int[s.length];
		int[] iAnew = new int[iA.length];
		// parsing
		for (int i = 0; i < iA.length; i++) {
			iA[i] = Integer.parseInt(s[i]);
		}
		// System.out.println(iAnew[0]);

		// newArray
		iAnew[0] = iA[0];
		for (int i = 1; i < iA.length; i++) {
			iAnew[i] = iA[i] + iA[i - 1];
		}
		// printNewArray
		System.out.println(Arrays.toString(iAnew));
	}
}
