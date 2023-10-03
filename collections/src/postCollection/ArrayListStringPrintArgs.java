package postCollection;

import java.util.*;

public class ArrayListStringPrintArgs {
	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<>();
		for (int i = 0; i < args.length; i++) {
			s.add(args[i]);
			System.out.print(s.get(i) + ",");
		}

	}
}
