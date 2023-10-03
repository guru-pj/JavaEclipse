package postCollection;

import java.util.ArrayList;

public class ArrayListIntPrintArgs {
	public static void main(String[] args) {

		ArrayList<Integer> s = new ArrayList<>();

		for (int i = 0; i < args.length; i++) {
			s.add(Integer.parseInt(args[i]));
			if (s.get(i) % 2 == 0) {
				System.out.print(s.get(i) + "-Even,");
			} else {
				System.out.print(s.get(i) + "-Odd,");
			}
		}
	}
}
