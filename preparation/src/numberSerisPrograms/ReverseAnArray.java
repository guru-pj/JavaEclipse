package numberSerisPrograms;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 90, 7, 4, 9, 10, 23, 11, 25, 66, 71, 99, 88, 89 };
		int[] aRev = new int[a.length];
		int j = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			aRev[j] = a[i];
			j++;
		}
		System.out.println(Arrays.toString(aRev));
	}
}
