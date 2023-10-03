package java8;

import java.util.*;

public class PrintStringLengthMoreThan4 {
	public void printStringWith4Length(List<String> sA) {
		for (String s : sA) {
			if (s.length() > 4) {
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) {
		String[] sA = { "hadjhb", "asd", "dasadas", "ds", "s" };

		ArrayList<String> s = new ArrayList<>();
//	AnotherMethod using Arrays Class
//  List<String>s=Arrays.asList("","","","","");	
		for (int i = 0; i < sA.length; i++) {
			s.add(sA[i]);
		}

		PrintStringLengthMoreThan4 p = new PrintStringLengthMoreThan4(); // object creation for method ref class
		PrintStringLengthWith4Interface print = p::printStringWith4Length; // method referencing using interface and
																			// object of the class
		print.length(s);// printing using created var of interface
	}
}
