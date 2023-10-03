package programs;

public class firstRepeatedElementinIntArray {
	public static void main(String[] args) {
		int[] iA = { 2, 7, 7, 7, 7, 2, 2, 1, 1, 7 };
		int min = 0;
//		for (int i = 0; i < iA.length; i++) {
//			int currentIndex = i;
//			int firstRepeat = 0, repeatIndex = 0;
//			for (int j = i + 1; j < iA.length; j++) {
//				currentIndex = i;
//				if (iA[i] == iA[j]) {
//					firstRepeat = 1;
//					repeatIndex = j;
//					break;
//				}
//
//			}
//
//			if (firstRepeat == 1) {
//				System.out.println(iA[i] + " at index " + currentIndex + " first repeated at index " + repeatIndex);
//				if (min > repeatIndex) {
//					min = repeatIndex;
//				}
//			}
//
//		}
//		System.out.println(iA[min]);

		int leastIndex = iA.length;
		int leastIndexValue = -1;
		for (int i = 0; i < iA.length; i++) {
			for (int j = i + 1; j < iA.length; j++) {
				if (iA[i] == iA[j] && j < leastIndex) {
					leastIndex = j;
					leastIndexValue = iA[j];

				}
			}
		}
		System.out.println(leastIndexValue);
	}
}
