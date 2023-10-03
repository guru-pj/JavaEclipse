package collection;

import java.util.*;

public class ArrayToArrayListAndViceVersa {
	public static void main(String[] args) {
		// *****************Integer Array******************
		System.out.println("                        *****************Integer Array******************");
//Array to ArrayList
		Integer[] iA = { 1, 2, 3, 4, 5 }; // int array
		System.out.println(iA);
		List<Integer> iAl = Arrays.asList(iA);
		System.out.println(iAl);// printing as list
//Array to ArrayList
		int[] iA2 = { 6, 7, 8, 9, 10 }; // int array
		System.out.println(iA2);
		ArrayList<Integer> iAl2 = new ArrayList<>();
		// or List<Integer> iAl2 = new ArrayList<>();
		for (int i = 0; i < iA2.length; i++) {
			iAl2.add(iA2[i]);
		}
		System.out.println(iAl2);// printing as list

//ArrayList to Array			
		Integer[] iA2new = iAl2.toArray(new Integer[iAl2.size()]);
		System.out.println(iA2new);
		System.out.println(Arrays.toString(iA2new));
		// printing an array
		for (Integer x : iA2new) {
			System.out.println(x);
		}

		// *****************String Array******************
		System.out.println("                        *****************String Array******************");
//Array to ArrayList
		String[] sA = { "Guru", "dilip", "vishnu", "dharani", "Arun", "Godwin" };
		// printing an array
		for (String x : sA) {
			System.out.println(x);
		}
		System.out.println();
		System.out.println(sA);
		System.out.println(Arrays.toString(sA));

		List<String> sAl = Arrays.asList(sA);
		System.out.println(sAl);

//ArrayList to Array		
		String[] sAnew = sAl.toArray(new String[sAl.size()]);
		System.out.println(sAnew);
		for (String x : sAnew) {
			System.out.println(x);
		}
	}
}
