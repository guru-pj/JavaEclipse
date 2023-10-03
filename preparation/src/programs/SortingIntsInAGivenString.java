package programs;

import java.util.Arrays;

//String s="1,2,4,3,8,5,10,7"->sorting and printing
public class SortingIntsInAGivenString {
	public static void main(String[] args) {
		String s = "1,2,8,7,6,5,3,9";
		String[] sA = s.split(",");
		int[] iA = new int[sA.length];
		for (int i = 0; i < iA.length; i++) {
			iA[i] = Integer.parseInt(sA[i]);
		}
		System.out.println(Arrays.toString(iA));
		int t = 0;
		for (int i = 0; i < iA.length; i++) {
			for (int j = 1; j < (iA.length - i); j++) {// for starts with 1 so ends at j<(n-i-1)//or if starts with zero
														// then
				// ends
				// at j<n-i-1
				// swaping the elements
				if (iA[j - 1] > iA[j]) { // for starts with 1 so condition iA[j-1]>iA[j]//or starts with 0 so condition
											// iA[j]>iA[j+1]

					t = iA[j - 1];
					iA[j - 1] = iA[j];
					iA[j] = t;
				}
			}
		}
		System.out.println(Arrays.toString(iA));

	}
}
