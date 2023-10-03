package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 2, 6, 7, 6, 9, 6, 7 };

		ArrayList<Integer> iAl = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			iAl.add(a[i]);
		}
		System.out.println(iAl);
		List<Integer> iAlnew = iAl.stream().distinct().collect(Collectors.toList());
		System.out.println(iAlnew);

//		Map<Object, Object> iAhm = iAl.stream().collect(Collectors.toMap(x -> x., y -> y));
//		System.out.println(iAhm);

	}
}
