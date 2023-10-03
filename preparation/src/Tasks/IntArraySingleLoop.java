package Tasks;

public class IntArraySingleLoop {
	static int findduplicate(int[] a) {
		int n = a.length;
		int i = 0, j = 0;
		while (i < n) {
			if (a[i] == a[++j])
				return a[j];
			if (j == n - 1) {
				i++;
				j = i;
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		int[] arr = { 1, 2, 4, 3, 4, 5, 6, 3 };
		int n = arr.length;
		System.out.print(findduplicate(arr));
	}
}
