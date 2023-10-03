package numberSerisPrograms;

import java.util.Arrays;

public class SecondHighestElementInAnArray {
	public void sort(int[] a) {
		int n = a.length;
		int t = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 1; j < n; j++) {
				if (a[i] < a[j]) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}

	}

	public static void main(String[] args) {
		SecondHighestElementInAnArray o = new SecondHighestElementInAnArray();
//		int[] a = { 2, 1 };
		int[] a = { 1, 2, 3, 90, 7, 4, 9, 10, 23, 11, 25, 66, 71, 99, 88, 89 };
		o.sort(a);
		System.out.println(a[a.length - 2]);

	}
}
