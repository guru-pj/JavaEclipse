package programs;

//input ->{1,2,3,4,5,6,7,8,10}   output->1 4,2 3
import java.util.*;

public class Adding2PaisInAIntArrayGives5 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 2, 3);
		System.out.println(nums);

		Integer[] iA = nums.toArray(new Integer[nums.size()]);
		System.out.println(Arrays.toString(iA));
		for (int i = 0; i < iA.length; i++) {
			for (int j = i + 1; j < iA.length; j++) {
				if (iA[i] + iA[j] == 5) {
					System.out.println(iA[i] + " " + iA[j]);
				}
			}
		}

	}
}
