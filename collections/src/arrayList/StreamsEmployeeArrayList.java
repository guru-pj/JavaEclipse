package arrayList;

import java.net.Socket;
import java.util.ArrayList;

public class StreamsEmployeeArrayList {
	public static void main(String[] args) {
		String n1 = "Guru";
		String n2 = "Godwin";
		String n3 = "Selva";

		ArrayList<String> employees = new ArrayList<>();
		employees.add(n1);
		employees.add(n2);
		employees.add(n3);
		System.out.println(employees);// 1st print

		employees.add("Moorthy");
		employees.add("Dilip");
		employees.add("Vishnu");
		employees.add("Sathya");
		System.out.println(employees);// 2nd print

		employees.add(0, "Vinoth");
		System.out.println(employees);// 3rd print

		employees.set(0, "Raja");
		System.out.println(employees);// 4th print

		System.out.println(employees.size());// 5th

		employees.remove(0);
		System.out.println(employees.size());/// 6th
		System.out.println(employees);// 7th

		System.out.println(employees.get(6));// 8th

		for (int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i) + " at " + "index " + i);//
		}
		System.out.println("Print All the names which contains o is them");
		for (String i : employees) {
			if (i.contains("o")) {
				System.out.println(i);
			}

		}

	}
}
