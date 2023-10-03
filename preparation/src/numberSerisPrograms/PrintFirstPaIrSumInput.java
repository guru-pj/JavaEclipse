package numberSerisPrograms;

public class PrintFirstPaIrSumInput {
	public static void main(String[] args) {
		int[] a = { 2, 2, 3, 4, 6, 7, 8, 9, 9 };
		int n = a.length, t = 11;
		int l = -1, k = -1;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i; j < n; j++) {
				if (a[i] + a[j] == t) {
					// System.out.println(a[i] + " " + a[j]);
					l = i;
					k = j;
					break;
				}
			}

			if (l != -1) {
				System.out.println(a[l] + " at index " + l + "\n" + a[k] + " at index " + k);
				break;
			}
		}
	}
}
