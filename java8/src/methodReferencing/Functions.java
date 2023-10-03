package methodReferencing;

public class Functions {
	public int max(int[] iA) {
		int max1 = iA[0];
		for (int i = 0; i < iA.length; i++) {
			if (iA[i] >= max1) {
				max1 = iA[i];
			}

		}
		return max1;
	}

	public int min(int[] iA) {
		int min1 = iA[0];
		for (int i = 0; i < iA.length; i++) {
			if (iA[i] <= min1) {
				min1 = iA[i];
			}
		}
		return min1;
	}

	public void maxi(int[] iA) {
		int max1 = iA[0];
		for (int i = 0; i < iA.length; i++) {
			if (iA[i] > max1) {
				max1 = iA[i];
			}

		}
		System.out.println(max1);
	}

	public void mini(int[] iA) {
		int min1 = iA[0];
		for (int i = 0; i < iA.length; i++) {
			if (iA[i] < min1) {
				min1 = iA[i];
			}
		}
		System.out.println(min1);
	}
}
