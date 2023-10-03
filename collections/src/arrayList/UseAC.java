package arrayList;

import java.util.*;

public class UseAC {
	public static void main(String[] args) {
		//SingletonExample
		AC a1=AC.getOfSingleton();
		
		
		AC ac1 = new AC("DAIKIN", 1.5f, 5, false);
		AC ac2 = new AC("SAMSUNG", 2.0f, 6, true);
		AC ac3 = new AC("VOLTAS", 1.5f, 5, true);
		AC ac4 = new AC("BLUESTAR", 2.5f, 5, true);
		AC ac5 = new AC("OG", 2.0f, 10, true);

		ArrayList<AC> acs = new ArrayList<>();

		System.out.println(acs.size());
		acs.add(ac1);
		acs.add(ac2);
		acs.add(ac3);
		acs.add(ac4);
		acs.add(ac5);
		System.out.println(acs.size());
		// System.out.println(acs.get(0));xq
//enhanced forloop print objects arraylist
		for (AC i : acs) {
			if (i.getW() > 5) {
				System.out.println(i);
			}
		}
		ac1.setT(2.5f);

		System.out.println(ac1.getT());
		System.out.println("FOR EACH METHOD IN COLLECTIONS");// for each method
//forEach() pprint objects arraylist
		acs.forEach(i -> System.out.println(i));
		// print as whole arrayList
		System.out.println(acs);
		System.out.println(ac1.hashCode());
		System.out.println(ac2.hashCode());
		System.out.println(ac3.hashCode());

	}
}
